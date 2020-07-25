package by.tms.bootstore.entity.books;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private long id;

    private String name;
    private String author;
    private Format format;
    private String publisher;
    private int publicationDate;
    private int pages;

    private List<Genres> genres;

    private List<Review> review;

    private double cost;
    private StatusBook statusBook;
    private String description;


}
