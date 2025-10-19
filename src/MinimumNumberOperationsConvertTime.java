import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MinimumNumberOperationsConvertTime {
    public int convertTime(String current, String correct) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime cor = LocalTime.parse(correct, formatter);
        LocalTime cur = LocalTime.parse(current,formatter);

        Duration duration = Duration.between(cur, cor);
        long minutes = duration.toMinutes();

        int count = 0;
        while (minutes > 0){
            if (minutes >= 60) minutes -= 60;
            else if (minutes >= 15) minutes -= 15;
            else if (minutes >= 5) minutes -= 5;
            else minutes -= 1;
            count++;
        }
        return count;
    }
}
