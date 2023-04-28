package com.teksystems.formbeans;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * user books form bean to get the information on the user books
 */
@Getter
@Setter
@ToString
public class UserBooksFormBean {

    private Integer id;

    private Integer bookId;

    private String bookshelf;

    private String title;

}
