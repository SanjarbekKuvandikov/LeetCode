import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CountDaysSpentTogether {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        int years = 2025;
        long days = 0;

        LocalDate arriveAliceDate = LocalDate.parse(years + "-" + arriveAlice,dateTimeFormatter);
        LocalDate leaveAliceDate = LocalDate.parse(years + "-" + leaveAlice,dateTimeFormatter);

        LocalDate arriveBobDate = LocalDate.parse(years + "-" + arriveBob,dateTimeFormatter);
        LocalDate leaveBobDate = LocalDate.parse(years + "-" + leaveBob,dateTimeFormatter);

        LocalDate start = arriveAliceDate.isAfter(arriveBobDate) ? arriveAliceDate : arriveBobDate;
        LocalDate end = leaveAliceDate.isBefore(leaveBobDate) ? leaveAliceDate : leaveBobDate;

        if (!start.isAfter(end)){
            days = ChronoUnit.DAYS.between(start,end) + 1;
        }


        return Math.toIntExact(days);
    }
}
