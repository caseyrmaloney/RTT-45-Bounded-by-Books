package com.teksystems.dao;

import com.teksystems.database.dao.CommentsDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommentsDAOTest {

    @Autowired
    CommentsDAO commentsDAO;

    @Test
    public void getBooksComments(){
        commentsDAO.getBookComments(1);
    }


}
