package com.teksystems.database.dao;

import com.teksystems.database.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BooksDAO  extends JpaRepository<Book, Long> {

    @Query("FROM Book b")
    List<Book> getAllBooks();

    Book findById(Integer id);


    List<Book> findByTitleContainingOrAuthorContainingIgnoreCase(String title, String author);

    List<Book> findByAuthorContainingIgnoreCase(String author);

    List<Book> findByTitleContainingIgnoreCase(String title);




}
