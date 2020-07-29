package by.tms.bootstore.service.DTO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class BookReviewDTO {

    @Id
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
