package by.tms.bootstore.entity.books;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.GregorianCalendar;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {


    private long id;
    private String body;
    private Estimation estimation;
    private long IdUser;
    private GregorianCalendar date;
}
