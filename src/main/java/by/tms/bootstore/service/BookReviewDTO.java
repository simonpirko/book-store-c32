package by.tms.bootstore.service;

public class BookReviewDTO {

    private Long idBook;
    private Long idReview;

    public BookReviewDTO(Long idBook, Long idReview) {
        this.idBook = idBook;
        this.idReview = idReview;
    }

    public BookReviewDTO() {
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public Long getIdReview() {
        return idReview;
    }

    public void setIdReview(Long idReview) {
        this.idReview = idReview;
    }
}
