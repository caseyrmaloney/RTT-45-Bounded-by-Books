package com.teksystems.dao;

import com.teksystems.database.dao.UserDAO;
import com.teksystems.database.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserDAOTest {

    @Autowired
    UserDAO userDAO;

    @Test
    @Order(0)
    public void createUser(){
        User given = new User();
        given.setFirstName("KC");
        given.setLastName("M");
        given.setEmail("kc@email.com");
        given.setPassword("password");

        userDAO.save(given);

        User actual = userDAO.findByEmail("kc@email.com");

        Assertions.assertEquals(given.getFirstName(), actual.getFirstName());
        Assertions.assertEquals(given.getLastName(), actual.getLastName());
        Assertions.assertEquals(given.getEmail(), actual.getEmail());
        Assertions.assertEquals(given.getPassword(), actual.getPassword());

    }

    @Test
    @Order(1)
    public void updateUser(){

        User given = userDAO.findByEmail("kc@email.com");

        given.setFirstName("Casey");
        given.setLastName("Maloney");

        User actual = userDAO.findByEmail("kc@gmail.com");

        Assertions.assertEquals(given.getFirstName(), actual.getFirstName());
        Assertions.assertEquals(given.getLastName(), actual.getLastName());

    }

    @Test
    @Order(2)
    public void deleteUser(){
        User given = userDAO.findByEmail("kc@email.com");

        userDAO.delete(given);

        User actual = userDAO.findByEmail("kc@email.com");
        Assertions.assertNull(actual);
    }


}
