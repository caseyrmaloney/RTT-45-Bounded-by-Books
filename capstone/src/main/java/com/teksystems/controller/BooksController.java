package com.teksystems.controller;

import com.teksystems.database.dao.BooksDAO;
import com.teksystems.database.dao.CommentsDAO;
import com.teksystems.database.dao.UserBooksDAO;
import com.teksystems.database.dao.UserDAO;
import com.teksystems.database.entity.Book;
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
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * The Books controller has everything to do with the users and the books relationship
 * methods to display the books in the database and allowing users to add books to their library
 */

@Controller
@RequestMapping("/books")
@PreAuthorize("hasAuthority('USER')")
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

    /**
     *
     * @param title
     * @return
     * returns the results of books for the explore page
     * takes in title of book as param so users can search for a book based on the title
     * creating a new list of books and searching through the database based on the search engine
     * returning the list of book objects to the page
     */
    @RequestMapping(value = "/explore", method = RequestMethod.GET)
    public ModelAndView bookSearch(@RequestParam(required = false) String title) {

        ModelAndView response = new ModelAndView("books/explore");

        // by this line of code we are assuming both are empty thus creating a new list with no search results
        // it has no results because there are no values coming.
        List<Book> books = new ArrayList<>();

        if (!StringUtils.isEmpty(title)) {
            books = booksDAO.getAllBooks();
        }


        //looking for the book by the title
        books = booksDAO.findByTitleContainingIgnoreCase(title);

        response.addObject("booksList", books);


        response.addObject("title", title);

        return response;

    }


    /**
     *
     * @param form
     * @return
     * this is the submit search method for the explore page
     * taking in the book form bean as a param and getting the information of the book form the form bean
     * saving the book in the database and returning the response to the page
     */
    @GetMapping("/createSubmit")
    public ModelAndView createSubmit(BookFormBean form) {
        log.debug("in the create submit controller");
        ModelAndView response = new ModelAndView("books/explore");
        log.debug("!!!!!!!!!!!!!!!!!!!!---- create submit controller");
        log.debug(form.toString());

        Book book = new Book();

        if (form.getId() != null && form.getId() > 0) {
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

    /**
     *
     * @param id
     * @return
     * this is the book comment method that displays the comments to post a comment for the individual book
     * takes in the book id as the parma to find the book based on the id
     * returns the book information to display on the page
     */
    @GetMapping("/comment/{id}")
    //the path varaible is what is shown in the URL
    public ModelAndView bookComments(@PathVariable Integer id) {
        ModelAndView response = new ModelAndView("books/comment");
        log.debug("In the book comment controller  " + id);

        Book book = booksDAO.findById(id);


        response.addObject("books", book);


        log.debug(book + "");
        return response;
    }

    /**
     *
     * @param form
     * @return
     * this is the comment submit method that saves the comment in the database for each book based on the user
     * it takes in the comment form bean to get the information the user inputted
     * it creates a new user object and uses the authenticated user method to set the user
     * creates a new comment object and sets the object from the form description
     * redirects you back to the book details page to display all of the comments
     */
    // inside the method - use the authenticated user service to load the user
    // then add the user object to the comment
    // then the use book id to query the book
    // add the book to the comment
    @GetMapping("/commentSubmit")
    public ModelAndView commentSubmit(CommentFormBean form) {
        log.debug("in the create submit controller");
        ModelAndView response = new ModelAndView("redirect:/books/details/" + form.getBookId());
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
        Book book = booksDAO.findById(form.getBookId());
        comment.setBook(book);

        //ADDING THE COMMENT FROM THE FORM
        comment.setComment(form.getComment());
        comment.setCreateDate(new Date());

        //SAVING THE COMMENT INTO THE DATABASE
        commentsDAO.save(comment);

        response.addObject("form", form);


        return response;
    }

    /**
     *
     * @param form
     * @return
     * this is the post mapping for comments that display the comments of the book
     * takes in the comment form bean and creates a new comment object and sets the comment and saves it in the database
     */
    @PostMapping("/comment")
    public ModelAndView bookComments(CommentFormBean form) {
        ModelAndView response = new ModelAndView("books/comment");
        Book book = new Book();
        Comments comment = new Comments();
        comment.setComment(form.getComment());

        commentsDAO.save(comment);

        return response;
    }


    /**
     *
     * @param id
     * @return
     * returns the book detail page to display all the books information and the comments to the book
     * takes in book id as a param and sets the book object to the book based on the id
     * query in the comments to display the comments
     * add the response of books details and comments to the page
     *
     */

    @GetMapping("/details/{id}")
    //the path varaible is what is shown in the URL
    public ModelAndView bookDetails(@PathVariable Integer id) {
        ModelAndView response = new ModelAndView("books/details");
        log.debug("In the book details conttroller  " + id);

        Book book = booksDAO.findById(id);

        //USER A QUERY TO SELECT THE COMMENTS FROM BOOK ID WHERE BOOK ID = ID

        List<Comments> comments = commentsDAO.getBookComments(id);

        response.addObject("books", book);
        response.addObject("commentsList", comments);

        User user = userDAO.findById(id);
        response.addObject("user", user);





        log.debug(book + "");
        return response;
    }

    /**
     *
     * @param form
     * @return
     * returns the page to add a book to the users library
     * takes in the user form bean as a param and redirects once submitted to the users books page
     * loads the current user from the authenticated user method and creates a new user book object
     * the user book object is set from the form to get the book id and the user if
     * it makes a new book object and then checks to see if the user books is null
     * if its null then it sets the user, book id, and sets the book to the user
     * if the book is already in their library it updated the bookshelf
     */
    @GetMapping("/addBookToUserSubmit")
    public ModelAndView addBookToUserSubmit(UserBooksFormBean form) {

        ModelAndView response = new ModelAndView("redirect:/user/myBooks");
        log.debug("in the add book to user submit controller");
        log.debug(form.toString());


        //using the authenticated user service to load the current user
        User user = authenticated.loadCurrentUser();

        //if the book exist in the database then just display it on the page and have update button
        //if the result is null then do the stuff to create a new


        //getting an existing data
        //UserBook userBook = userBookDAO.findbyBookidandUserId();
        //if the book is null
        //create a new user book
        //if not update status


        //creating a new user book and seeing if it exists in the database with book id and user id
        UserBook userBook= userBooksDAO.findUserBookByBookIdAndUserId(form.getBookId(), user.getId());

        Book book = new Book();

        //if the user book returns back null then set the user, book id, and set the book to user
        if(userBook == null) {

            userBook = new UserBook();
            //setting the user
            userBook.setUser(user);
            //setting the book id
            book = booksDAO.findById(form.getBookId());
            userBook.setBook(book);

        }

        //edits the exisiting book to a new shelf if its already in the database
        //adding the book to a bookshelf
        //stays out if statement
        userBook.setBookshelf(form.getBookshelf());
        //saving the book and bookshelf to the database
        userBooksDAO.save(userBook);
        response.addObject("books", book);
        response.addObject("form", form);


        return response;

    }


}
