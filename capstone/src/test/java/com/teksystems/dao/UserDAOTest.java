package com.teksystems.dao;

import com.teksystems.database.dao.UserDAO;
import com.teksystems.database.entity.User;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserDAOTest {


    private static final String EMAIL = "kc@email.com";

    @Autowired
    UserDAO userDAO;

    @Test
    @Order(0)
    public void createUser(){
        User given = new User();
        given.setFirstName("KC");
        given.setLastName("M");
        given.setEmail(EMAIL);
        given.setPassword("password");

        userDAO.save(given);

        User actual = userDAO.findByEmail(EMAIL);

        Assertions.assertEquals(given.getFirstName(), actual.getFirstName());
        Assertions.assertEquals(given.getLastName(), actual.getLastName());
        Assertions.assertEquals(given.getEmail(), actual.getEmail());
        Assertions.assertEquals(given.getPassword(), actual.getPassword());

    }

    @Test
    @Order(1)
    public void updateUser(){

        User given = userDAO.findByEmail(EMAIL);



        given.setFirstName("Casey");
        given.setLastName("Maloney");

        userDAO.save(given);

        User actual = userDAO.findByEmail(EMAIL);

        Assertions.assertEquals(given.getFirstName(), actual.getFirstName());
        Assertions.assertEquals(given.getLastName(), actual.getLastName());

    }

    @Test
    @Order(2)
    public void deleteUser(){
        User given = userDAO.findByEmail(EMAIL);

        userDAO.delete(given);

        User actual = userDAO.findByEmail(EMAIL);
        Assertions.assertNull(actual);
    }


}
