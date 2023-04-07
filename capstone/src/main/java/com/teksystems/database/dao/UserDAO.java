package com.teksystems.database.dao;
import com.teksystems.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDAO extends JpaRepository<User, Long> {

    @Query("FROM User u")
    List<User> getAllUsers();

    User findById(Integer id);

    List<User> findByFirstNameContainingOrLastNameContainingIgnoreCase(String firstName, String lastName);

    List<User> findByFirstNameContainingIgnoreCase(String firstName);

    List<User> findByLastNameContainingIgnoreCase(String lastName);
}
