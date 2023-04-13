package com.teksystems.database.dao;

import com.teksystems.database.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentsDAO extends JpaRepository<Comments, Long> {

    @Query("FROM Comments c")
    List<Comments> getAllComments();

    @Query("FROM Comments c where c.bookId = :id")
    List<Comments> getBookComments(Integer id);

    Comments findById(Integer id);
}
