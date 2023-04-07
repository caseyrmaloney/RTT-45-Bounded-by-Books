package com.teksystems.database.dao;

import com.teksystems.database.entity.Books;
import com.teksystems.database.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BooksDAO  extends JpaRepository<Books, Long> {

    @Query("FROM Books b")
    List<Books> getAllBooks();

    Books findById(Integer id);


    List<Books> findByTitleContainingOrAuthorContainingIgnoreCase(String title, String author);

    List<Books> findByAuthorContainingIgnoreCase(String author);

    List<Books> findByTitleContainingIgnoreCase(String title);




}
