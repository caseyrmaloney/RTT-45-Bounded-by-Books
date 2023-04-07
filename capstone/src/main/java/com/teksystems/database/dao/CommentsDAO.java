package com.teksystems.database.dao;

import com.teksystems.database.entity.Comments;
import com.teksystems.database.entity.UserBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentsDAO extends JpaRepository<Comments, Long> {

    @Query("FROM Comments c")
    List<Comments> getAllComments();

    Comments findById(Integer id);
}
