package com.teksystems.database.dao;

import com.teksystems.database.entity.User;
import com.teksystems.database.entity.UserBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserBooksDAO extends JpaRepository<UserBooks, Long> {

    @Query("FROM UserBooks ub")
    List<UserBooks> getAllUsers();

    UserBooks findById(Integer id);
}
