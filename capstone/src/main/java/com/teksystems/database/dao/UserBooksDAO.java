package com.teksystems.database.dao;

import com.teksystems.database.entity.Book;
import com.teksystems.database.entity.UserBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface UserBooksDAO extends JpaRepository<UserBook, Long> {


    UserBook findById(Integer id);

    @Query(value = "select * from user_books ub, books b\n" +
            "where \n" +
            "ub.book_id = b.id\n" +
            "and \n" +
            "user_id= :id ;", nativeQuery = true)
    List<Map<String,Object>> getUsersBook(Integer id);
    @Query(value = "select * from user_books ub, books b\n" +
            "where \n" +
            "ub.book_id = b.id\n" +
            "and \n" +
            "user_id= :id \n" +
            "and bookshelf =\" :bookshelf \" ;", nativeQuery = true)
    List<Map<String,Object>> getUserBookShelfBooks(Integer id, String bookshelf);



}

