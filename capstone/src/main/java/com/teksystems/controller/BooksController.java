package com.teksystems.controller;

import com.teksystems.database.dao.BooksDAO;
import com.teksystems.database.entity.Books;
import com.teksystems.formbeans.BookFormBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/books")
@Slf4j
public class BooksController {

    @Autowired
    private BooksDAO booksDAO;

    @RequestMapping(value = "/explore", method = RequestMethod.GET)
    public ModelAndView bookSearch(@RequestParam(required=false) String title){

        ModelAndView response = new ModelAndView("books/explore");

        // by this line of code we are assuming both are empty thus creating a new list with no search results
        // it has no results because there are no values coming.
        List<Books> books = new ArrayList<>();

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



}
