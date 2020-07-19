package by.tms.bootstore.entity.books;

import java.util.List;

public class Book {

    private long id;
    private String name;
    private String author;
    private String format;
    private String publisher;
    private String publicationDate;
    private String pages;
    private List<Genres> genres;
    private List<Review> review;
    private double cost;
    private StatusBook statusBook;
    private String description;


}
