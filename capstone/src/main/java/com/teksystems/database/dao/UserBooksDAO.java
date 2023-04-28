package com.teksystems.database.dao;

import com.teksystems.database.entity.Book;
import com.teksystems.database.entity.UserBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

/**
 * user books dao that queries the users books from the database
 */

public interface UserBooksDAO extends JpaRepository<UserBook, Long> {


    /**
     *
     * @param id
     * @return
     * native query that joins the user books and books tables to return the users books in the database based
     * on the user id
     */
    @Query(value = "select * from user_books ub, books b\n" +
            "where \n" +
            "ub.book_id = b.id\n" +
            "and \n" +
            "user_id= :id ;", nativeQuery = true)
    List<Map<String,Object>> getUsersBook(Integer id);


    /**
     *
     * @param bookId
     * @param userId
     * @return
     * returns a user books based on the book id and user id
     */
    UserBook findUserBookByBookIdAndUserId(Integer bookId, Integer userId);

    /**
     *
     * @return
     * JPA query that gets the bookshelves from the user books
     */
    @Query("FROM UserBook ub order by  ub.bookshelf asc")
    List<UserBook> getAllBookshelves();


}

