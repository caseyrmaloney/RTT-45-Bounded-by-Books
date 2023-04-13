package org.example.database.dao;

import org.example.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.example.database.entity.User;

public interface UserDAO extends JpaRepository<User, Long> {

    User findByEmail(String email);


    boolean existsByEmail(String value);
}
