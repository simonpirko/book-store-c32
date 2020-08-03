package by.tms.bootstore.dao.rowMapper;

import by.tms.bootstore.entity.books.Estimation;
import by.tms.bootstore.entity.books.Review;
import lombok.SneakyThrows;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class ReviewRowMapper implements RowMapper<Review> {
    @SneakyThrows
    @Override
    public Review mapRow(ResultSet rs, int rowNum) throws SQLException {
        Review review = new Review();
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
        cal.setTime(sdf.parse(rs.getString("PUBLICATIONDATE")));
        review.setId(rs.getInt("ID"));
        review.setBody(rs.getString("BODY"));
        review.setEstimation(Estimation.valueOf(rs.getString("ESTIMATION")));
        review.setIdUser(rs.getLong("IDUSER"));
        review.setDate((GregorianCalendar) cal);
        return review;
    }
}
