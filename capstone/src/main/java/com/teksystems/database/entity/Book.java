package com.teksystems.database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;
    @Column(name = "genre")
    private String genre;

    @Column(name = "publish_date")
    private Date publishDate;

    @Column(name = "description")
    private String description;

    @Column(name = "author")
    private String author;

    @Column(name = "page_length")
    private Integer pageLength;

    @Column(name = "book_cover_url")
    private String bookCover;

    @ToString.Exclude
    @OneToMany(mappedBy = "book", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<UserBook> user_books = new ArrayList<UserBook>();

    @ToString.Exclude
    @OneToMany(mappedBy = "book", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Comments> comments = new ArrayList<Comments>();




}
