package com.teksystems.dao;

import com.teksystems.database.dao.UserBooksDAO;
import com.teksystems.database.entity.UserBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class UserBooksDAOTest {

    @Autowired
    UserBooksDAO userBooksDAO;

    @Test
    public void getAllBookshelves(){
         userBooksDAO.getAllBookshelves();


    }

    @Test
    public void getUserBooks(){
       userBooksDAO.getUsersBook(3);
    }
}
