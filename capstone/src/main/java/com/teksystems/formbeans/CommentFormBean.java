package com.teksystems.formbeans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * comment form bean to get the comment information
 */
@Getter
@Setter
@ToString
public class CommentFormBean {

    private String comment;
    private Integer id;

    private Integer bookId;



}
