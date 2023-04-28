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
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * user controller to worry about everything that has to do with the user and displaying their information
 */

@Controller
@Slf4j
public class UserController {

    @Autowired
    private AuthenticatedUserService authenticated;

    @Autowired
    private BooksDAO booksDAO;

    @Autowired
    private UserBooksDAO userBooksDAO;


    /**
     *
     * @param session
     * @return
     * returns the user profile page to display their books
     * using the authenticated user to load the current user and setting the users books based on the user
     * creates a map of the of books objects and users books and returns that maps of objects
     * creates boolean var to see what shelf the book belongs to
     */
    //SET THE USER FROM THE AUTHENTICATED USER METHOD
    //USE A QUERY TO DISPLAY ALL BOOKS IN THE USER LIBRARY
    //USE A QUERY TO DISPLAY THE DIFFERENT BOOK SHELVES
    @GetMapping("/user/profile")
    public ModelAndView profile(HttpSession session) {
        log.debug("In the user profile controller");
        ModelAndView response = new ModelAndView("user/profile");

        //using the authenticated user service to load the current user
        User user = authenticated.loadCurrentUser();

        UserBook userBook = new UserBook();

        //setting the user
        userBook.setUser(user);

        //creating a list of all the books for user
        List<Map<String,Object>> bookList = new ArrayList<>();

        //populating the list from the userBook query from the user id
        bookList = userBooksDAO.getUsersBook(user.getId());

        //adding the response to the page
        response.addObject("bookList", bookList);

        //        for ( books ) {
        // book.getbookshelf = "reading "
//            if ( book contains key "reading" ){
//                reading = true;
//            }
//            if ( book contains key "wantToRead" ){
//                wantToRead = true;
//            }
//        }
//    }
//    response.addObjecT("isReading", isReading);


        boolean isReading = false;
        boolean wantToRead = false;
        boolean finished = false;
        for(Map<String, Object> books: bookList) {


            if(books.containsValue("Want to Read")) {
                wantToRead = true;
            }
            if(books.containsValue("Currently Reading")) {
                isReading= true;
            }
            if(books.containsValue("Finished Reading")) {
                finished = true;
            }
        }

        boolean hasBooks = false;

        if(!bookList.isEmpty()) {
            hasBooks = true;

        }

        response.addObject("hasBooks", hasBooks);
        response.addObject("isReading", isReading);
        response.addObject("wantToRead", wantToRead);
        response.addObject("finished", finished);



        return response;
    }


    /**
     *
     * @param session
     * @return
     *  returns the user my book page to display their books
     * using the authenticated user to load the current user and setting the users books based on the user
     * creates a map of the of books objects and users books and returns that maps of objects
     * creates boolean var to see what shelf the book belongs to
     *
     */
    @GetMapping("/user/myBooks")
    public ModelAndView myBooks(HttpSession session) {

        log.debug("In the my books controller");
        ModelAndView response = new ModelAndView("user/myBooks");

        //using the authenticated user service to load the current user
        User user = authenticated.loadCurrentUser();

        UserBook userBook = new UserBook();

        //setting the user
        userBook.setUser(user);

        //creating a list of all the books for user
        List<Map<String,Object>> bookList = new ArrayList<>();

        //populating the list from the userBook query from the user id
        bookList = userBooksDAO.getUsersBook(user.getId());

        //adding the response to the page
        response.addObject("bookList", bookList);

        boolean isReading = false;
        boolean wantToRead = false;
        boolean finished = false;
        for(Map<String, Object> books: bookList) {


            if(books.containsValue("Want to Read")) {
                wantToRead = true;
            }
            if(books.containsValue("Currently Reading")) {
                isReading= true;
            }
            if(books.containsValue("Finished Reading")) {
                finished = true;
            }
        }

        boolean hasBooks = false;

        if(!bookList.isEmpty()) {
            hasBooks = true;

        }

        List<UserBook> bookshelf = userBooksDAO.getAllBookshelves();
        response.addObject("bookshelf", bookshelf);

        UserBooksFormBean userBooksFormBean= new UserBooksFormBean();
        userBooksFormBean.setBookshelf(userBook.getBookshelf());
        response.addObject("form", userBooksFormBean);



        response.addObject("hasBooks", hasBooks);
        response.addObject("isReading", isReading);
        response.addObject("wantToRead", wantToRead);
        response.addObject("finished", finished);




        return response;



    }

















}
