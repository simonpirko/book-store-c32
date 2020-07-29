package by.tms.bootstore.entity.books;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String author;
    private Format format;
    private String publisher;
    private int publicationDate;
    private int pages;

    private List<Genres> genres;

    @MapsId
    private List<Review> review;

    private double cost;
    private StatusBook statusBook;
    private String description;

    public Book(String name, String author, Format format, String publisher, int publicationDate, int pages, List<Genres> genres, List<Review> review, double cost, StatusBook statusBook, String description) {
        this.name = name;
        this.author = author;
        this.format = format;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.pages = pages;
        this.genres = genres;
        this.review = review;
        this.cost = cost;
        this.statusBook = statusBook;
        this.description = description;
    }
}
