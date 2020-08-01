package by.tms.bootstore.service.DTO;

import by.tms.bootstore.entity.books.Format;
import by.tms.bootstore.entity.books.Genres;
import by.tms.bootstore.entity.books.Review;
import by.tms.bootstore.entity.books.StatusBook;

import java.util.List;

public class BookDTO {

    private String name;
    private String author;
    private Format format;
    private String publisher;
    private int publicationDate;
    private int pages;
    private double cost;
    private StatusBook statusBook;
    private String description;

    public BookDTO(String name, String author, Format format, String publisher, int publicationDate, int pages, double cost, StatusBook statusBook, String description) {
        this.name = name;
        this.author = author;
        this.format = format;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.pages = pages;
        this.cost = cost;
        this.statusBook = statusBook;
        this.description = description;
    }

    public BookDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public StatusBook getStatusBook() {
        return statusBook;
    }

    public void setStatusBook(StatusBook statusBook) {
        this.statusBook = statusBook;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
