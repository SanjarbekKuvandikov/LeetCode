import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class NumberDaysBetweenTwoDates {
    public int daysBetweenDates(String date1, String date2) {
        String pattern = "yyyy-MM-dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        LocalDate localDate1 = LocalDate.parse(date1,formatter);
        LocalDate localDate2 = LocalDate.parse(date2,formatter);

        long days = ChronoUnit.DAYS.between(localDate2,localDate1);

        return (int) Math.abs(days);
    }
}
