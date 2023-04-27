package com.teksystems.controller;

import com.teksystems.database.dao.BooksDAO;
import com.teksystems.database.dao.UserDAO;
import com.teksystems.database.entity.Book;
import com.teksystems.database.entity.User;
import com.teksystems.formbeans.BookFormBean;
import com.teksystems.formbeans.UserFormBean;
import io.micrometer.common.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin")
@PreAuthorize("hasAuthority('ADMIN')")
@Slf4j
public class AdminController {

    @Autowired
    private BooksDAO booksDAO;

    @Autowired
    private UserDAO userDAO;

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public ModelAndView addBook() {
        log.debug("in the add Book controller");

        ModelAndView response = new ModelAndView("admin/book");


        return response;
    }

    @GetMapping("/createSubmit")
    public ModelAndView createSubmit(BookFormBean form) {
        log.debug("in the create submit controller");
        ModelAndView response = new ModelAndView("admin/book");
        log.debug("!!!!!!!!!!!!!!!!!!!!---- create submit controller");
        log.debug(form.toString());

        Book book = new Book();

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

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable Integer id) {
        log.debug("in the edit book controller");
        ModelAndView response = new ModelAndView("admin/book");

        Book book = booksDAO.findById(id);
        BookFormBean form = new BookFormBean();

        form.setId(book.getId());
        form.setTitle(book.getTitle());
        form.setGenre(book.getGenre());
        form.setDescription(book.getDescription());
        form.setPublishDate(book.getPublishDate());
        form.setAuthor(book.getAuthor());
        form.setPageLength(book.getPageLength());
        form.setBookCover(book.getBookCover());


        response.addObject("form", form);


        return response;
    }



    @GetMapping("/detail/{id}")
    //the path varaible is what is shown in the URL
    public ModelAndView detail(@PathVariable Integer id){
        ModelAndView response = new ModelAndView("admin/detail");
        log.debug("In employee detail controller method with id = " + id);

        Book book = booksDAO.findById(id);

        response.addObject("books", book);

        log.debug(book + "");
        return response;
    }

    @RequestMapping(value = "/searchBooks", method = RequestMethod.GET)
    public ModelAndView bookSearch(@RequestParam(required=false) String title, @RequestParam(required=false) String author) {
        log.debug("In the employee search controller method with firstName = " + title + " lastName = " + author);

        ModelAndView response = new ModelAndView("admin/searchBooks");

        // by this line of code we are assuming both are empty thus creating a new list with no search results
        // it has no results because there are no values coming.
        List<Book> books = new ArrayList<>();

        // check if both title and author have a value
        if (!StringUtils.isEmpty(title) && !StringUtils.isEmpty(author)) {
            // if so run the qurey that works with both values
            log.debug("Both title and author have a value");
            books = booksDAO.findByTitleContainingOrAuthorContainingIgnoreCase(title, author);

            //stream the list of books and print them out
            books.stream().forEach(book -> {
                log.info(book.toString());
            });

        }

        // check if the title is not empty and the author is empty
        if (!StringUtils.isEmpty(title) && StringUtils.isEmpty(author)) {
            // we run our query that checks the title field only
            log.debug("Title has a value and author is empty");
            books = booksDAO.findByTitleContainingIgnoreCase(title);

            books.stream().forEach(book -> {
                log.debug(book.toString());
            });
        }

        // check if the title is empty and the author is not empty
        if (StringUtils.isEmpty(title) && !StringUtils.isEmpty(author)) {
            // we run our query that checks the author field only
            log.debug("Author has a value and title is empty");
            books = booksDAO.findByAuthorContainingIgnoreCase(author);

            books.stream().forEach(book -> {
                log.debug(book.toString());
            });
        }

        // check if both title and author have a value
        if (StringUtils.isEmpty(title) && StringUtils.isEmpty(author)) {
            // if so run the qurey that works with both values
            log.debug("Both title and author is empty");
            books = booksDAO.findByTitleContainingOrAuthorContainingIgnoreCase(title, author);

            books.stream().forEach(book -> {
                log.debug(book.toString());
            });
        }


        //addObject ()-- attributeName - name of the object to add to the model (never null)
        //attributeValue - object to add to the model (can be null)
        response.addObject("booksList", books);
        response.addObject("title",title);
        response.addObject("author",author);

        return response;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView addUser() {
        log.debug("in the add user controller");

        ModelAndView response = new ModelAndView("admin/user");


        return response;
    }

    @GetMapping("/editUser/{id}")
    public ModelAndView editUser(@PathVariable Integer id) {
        log.debug("in the edit User book controller");
        ModelAndView response = new ModelAndView("admin/user");

        User user = userDAO.findById(id);
        UserFormBean form = new UserFormBean();

        form.setId(user.getId());
        form.setEmail(user.getEmail());
        form.setPassword(user.getPassword());
        form.setFirstName(user.getFirstName());
        form.setLastName(user.getLastName());


        response.addObject("form", form);

        return response;
    }

    @GetMapping("/createSubmitUser")
    public ModelAndView createSubmitUser(UserFormBean form) {
        log.debug("in the create user submit controller");
        ModelAndView response = new ModelAndView("redirect:/admin/searchUser");
        log.debug("!!!!!!!!!!!!!!!!!!!!---- create user submit controller");
        log.debug(form.toString());

        User user = new User();

        if(form.getId() != null && form.getId() > 0) {
            user = userDAO.findById(form.getId());
        }

        user.setFirstName(form.getFirstName());
        user.setLastName(form.getLastName());
        user.setEmail(form.getEmail());
        user.setPassword(form.getPassword());



        response.addObject("form", form);

        userDAO.save(user);
        return response;
    }

    @RequestMapping(value = "/searchUser", method = RequestMethod.GET)
    public ModelAndView userSearch(@RequestParam(required=false) String firstName, @RequestParam(required=false) String lastName) {
        log.debug("In the user search controller method with firstName = " + firstName + " lastName = " + lastName);

        ModelAndView response = new ModelAndView("admin/searchUser");

        // by this line of code we are assuming both are empty thus creating a new list with no search results
        // it has no results because there are no values coming.
        List<User> user = new ArrayList<>();

        // check if both firstName and lastName have a value
        if (!StringUtils.isEmpty(firstName) && !StringUtils.isEmpty(lastName)) {
            // if so run the qurey that works with both values
            log.debug("Both first name and last name have a value");
            user = userDAO.findByFirstNameContainingOrLastNameContainingIgnoreCase(firstName, lastName);

            user.stream().forEach(u -> {
                log.debug(u.toString());
            });
        }

        // check if the first name is not empty and the last name is empty
        if (!StringUtils.isEmpty(firstName) && StringUtils.isEmpty(lastName)) {
            // we run our query that checks the fist name field only
            log.debug("First name has a value and last name is empty");
            user = userDAO.findByFirstNameContainingIgnoreCase(firstName);

            user.stream().forEach(u -> {
                log.debug(u.toString());
            });
        }

        // check if the first name is empty and the last name is not empty
        if (StringUtils.isEmpty(firstName) && !StringUtils.isEmpty(lastName)) {
            // we run our query that checks the last name field only
            log.debug("Last name has a value and first name is empty");
            user = userDAO.findByLastNameContainingIgnoreCase(lastName);

            user.stream().forEach(u -> {
                log.debug(u.toString());
            });
        }
        // check if the first name is empty and the last name is not empty
        if (StringUtils.isEmpty(firstName) && StringUtils.isEmpty(lastName)) {
            // we run our query that checks the last name field only
            log.debug("Both first name and last name is empty");
            user = userDAO.findByLastNameContainingIgnoreCase(lastName);

            user.stream().forEach(u -> {
                log.debug(u.toString());
            });
        }


        //addObject ()-- attributeName - name of the object to add to the model (never null)
        //attributeValue - object to add to the model (can be null)
        response.addObject("userList", user);
        response.addObject("firstName",firstName);
        response.addObject("lastName",lastName);

        return response;
    }








}
