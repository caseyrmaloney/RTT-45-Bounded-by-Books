package com.teksystems.dao;

import com.teksystems.database.dao.BooksDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BooksDAOTest {

    @Autowired
    BooksDAO booksDAO;

    @Test
    public void getAllBooksTest(){
        booksDAO.getAllBooks();
    }
}
