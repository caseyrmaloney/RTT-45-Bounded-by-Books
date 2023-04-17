package com.teksystems.database.dao;

import com.teksystems.database.entity.UserBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserBooksDAO extends JpaRepository<UserBook, Long> {

    @Query("FROM UserBook ub")
    List<UserBook> getAllUsers();

    UserBook findById(Integer id);
}
