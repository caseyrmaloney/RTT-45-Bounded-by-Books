package com.teksystems.database.dao;

import com.teksystems.database.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * books dao to query the books from the database
 */
public interface BooksDAO  extends JpaRepository<Book, Long> {

    /**
     *
     * @return a list of all books from the database
     */
    @Query("FROM Book b")
    List<Book> getAllBooks();

    /**
     *
     * @param id
     * @return
     * takes in book id as param returns a book based on the id
     */
    Book findById(Integer id);


    /**
     *
     * @param title
     * @param author
     * @return
     * takes in title and author as param returns books based both
     */
    List<Book> findByTitleContainingOrAuthorContainingIgnoreCase(String title, String author);

    /**
     *
     * @param author
     * @return
     * takes in author as param returns books based both
     */
    List<Book> findByAuthorContainingIgnoreCase(String author);

    /**
     *
     * @param title
     * @return
     * takes in title  as param returns books based both
     */
    List<Book> findByTitleContainingIgnoreCase(String title);




}
