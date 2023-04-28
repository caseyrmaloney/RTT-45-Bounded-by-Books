package com.teksystems.database.dao;
import com.teksystems.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * user dao , queries that return the user database
 */
public interface UserDAO extends JpaRepository<User, Long> {

    /**
     *
     * @return
     * JPA query that returns a list of all users
     */
    @Query("FROM User u")
    List<User> getAllUsers();

    /**
     *
     * @param id
     * @return
     * query that returns a user based on the id
     */
    User findById(Integer id);

    /**
     *
     * @param firstName
     * @param lastName
     * @return
     * returns a list of users based on the first name and last name
     */
    List<User> findByFirstNameContainingOrLastNameContainingIgnoreCase(String firstName, String lastName);

    /**
     *
     * @param firstName
     * @return
     * retruns a list of users based on the first name
     */
    List<User> findByFirstNameContainingIgnoreCase(String firstName);

    /**
     *
     * @param lastName
     * @return
     * returns a list of users based on the last name
     */
    List<User> findByLastNameContainingIgnoreCase(String lastName);

    /**
     *
     * @param email
     * @return
     * returns a user based on the email
     */
    User findByEmail(String email);

    /**
     *
     * @param value
     * @return
     * returns true or false if the user exist in the database based on the email value
     */
    boolean existsByEmail(String value);
}
