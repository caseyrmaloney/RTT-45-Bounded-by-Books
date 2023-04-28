package com.teksystems.database.dao;

import com.teksystems.database.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * comments dao, queries the comments from the database
 */
public interface CommentsDAO extends JpaRepository<Comments, Long> {


    /**
     *
     * @param id
     * @return
     * JPA query from the database that get the comments for the individual book based on the book id
     */
    @Query("FROM Comments c where c.bookId = :id")
    List<Comments> getBookComments(Integer id);

}
