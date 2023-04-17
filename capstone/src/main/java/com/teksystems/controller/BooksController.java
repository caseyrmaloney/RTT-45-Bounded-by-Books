package com.teksystems.controller;

import com.teksystems.database.dao.BooksDAO;
import com.teksystems.database.dao.CommentsDAO;
import com.teksystems.database.dao.UserBooksDAO;
import com.teksystems.database.dao.UserDAO;
import com.teksystems.database.entity.Books;
import com.teksystems.database.entity.Comments;
import com.teksystems.database.entity.User;
import com.teksystems.database.entity.UserBook;
import com.teksystems.formbeans.BookFormBean;
import com.teksystems.formbeans.CommentFormBean;
import com.teksystems.formbeans.UserBooksFormBean;
import com.teksystems.security.AuthenticatedUserService;
import io.micrometer.common.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/books")
@Slf4j
public class BooksController {

    @Autowired
    private BooksDAO booksDAO;

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private CommentsDAO commentsDAO;

    @Autowired
    private UserBooksDAO userBooksDAO;



    @Autowired
    private AuthenticatedUserService authenticated;

    @RequestMapping(value = "/explore", method = RequestMethod.GET)
    public ModelAndView bookSearch(@RequestParam(required=false) String title){

        ModelAndView response = new ModelAndView("books/explore");

        // by this line of code we are assuming both are empty thus creating a new list with no search results
        // it has no results because there are no values coming.
        List<Books> books = new ArrayList<>();

        if(!StringUtils.isEmpty(title)) {
            books= booksDAO.getAllBooks();
        }


        //looking for the book by the title
        books = booksDAO.findByTitleContainingIgnoreCase(title);

        response.addObject("booksList", books);


        response.addObject("title",title);

        return response;

    }





    @GetMapping("/createSubmit")
    public ModelAndView createSubmit(BookFormBean form) {
        log.debug("in the create submit controller");
        ModelAndView response = new ModelAndView("books/explore");
        log.debug("!!!!!!!!!!!!!!!!!!!!---- create submit controller");
        log.debug(form.toString());

        Books book = new Books();

        if(form.getId() != null && form.getId() > 0) {
            book = booksDAO.findById(form.getId());
        }

        book.setTitle(form.getTitle());
        book.setGenre(form.getGenre());
        book.setDescription(form.getDescription());
        book.setPublishDate(form.getPublishDate());
        book.setPageLength(form.getPageLength());
        book.setAuthor(form.getAuthor());
        book.setBookCover(form.getBookCover());


        response.addObject("form", form);

        booksDAO.save(book);
        return response;
    }

    @GetMapping("/comment/{id}")
    //the path varaible is what is shown in the URL
    public ModelAndView bookComments(@PathVariable Integer id){
        ModelAndView response = new ModelAndView("books/comment");
        log.debug("In the books comment controller  " + id);

        Books books = booksDAO.findById(id);



        response.addObject("books", books);


        log.debug(books + "");
        return response;
    }

    // inside the method - use the authenticated user service to load the user
    // then add the user object to the comment
    // then the use book id to query the book
    // add the book to the comment
    @GetMapping("/commentSubmit")
    public ModelAndView commentSubmit(CommentFormBean form) {
        log.debug("in the create submit controller");
        ModelAndView response = new ModelAndView("books/comment");
        log.debug("!!!!!!!!!!!!!!!!!!!!---- comment submit controller");
        log.debug(form.toString());

        //USE THE AUTHENTICATED USER SERVICE TO LOAD THE CURRENT USER
        User user = new User();
        user = authenticated.loadCurrentUser();

        //CREATING THE COMMENT OBJECT
        Comments comment = new Comments();

        //SETTING THE USER ID FROM THE AUTHENTICATED USER SERVICE
        comment.setUser(user);

        //SETTING THE BOOK ID
        Books book = booksDAO.findById(form.getBookId());
        comment.setBooks(book);

        //ADDING THE COMMENT FROM THE FORM
        comment.setComment(form.getComment());
        comment.setCreateDate(new Date());

        //SAVING THE COMMENT INTO THE DATABASE
        commentsDAO.save(comment);

        response.addObject("form", form);



        return response;
    }

    @PostMapping("/comment")
    public ModelAndView bookComments(CommentFormBean form){
        ModelAndView response = new ModelAndView("books/comment");

        Books book = new Books();
        Comments comment = new Comments();
        comment.setComment(form.getComment());

        commentsDAO.save(comment);



        return response;
    }




    @GetMapping("/details/{id}")
    //the path varaible is what is shown in the URL
    public ModelAndView bookDetails(@PathVariable Integer id){
        ModelAndView response = new ModelAndView("books/details");
        log.debug("In the books details conttroller  " + id);

        Books books = booksDAO.findById(id);

        //USER A QUERY TO SELECT THE COMMENTS FROM BOOK ID WHERE BOOK ID = ID

        List<Comments> comments= commentsDAO.getBookComments(id);

        response.addObject("books", books);
        response.addObject("commentsList", comments);

        User user = userDAO.findById(id);
        response.addObject("user", user);


        //ADDING A BOOK FOR THE USER LIBRARY




        log.debug(books + "");
        return response;
    }

    @GetMapping("/addBookToUserSubmit")
    public ModelAndView addBookToUserSubmit(UserBooksFormBean form){

        ModelAndView response = new ModelAndView("books/details");
        log.debug("in the add book to user submit controller");
        log.debug(form.toString());


        //using the authenticated user service to load the current user
        User user = authenticated.loadCurrentUser();

        //create a new user book object
        UserBook userBook = new UserBook();

        //setting the user
        userBook.setUser(user);

        //setting the book id
        Books books = booksDAO.findById(form.getBookId());
        userBook.setBooks(books);

        //adding the book to a bookshelf
        userBook.setBookshelf(form.getBookshelf());

        //saving the book and bookshelf to the database
        userBooksDAO.save(userBook);

        response.addObject("form" , form);

        return response;

    }















}
