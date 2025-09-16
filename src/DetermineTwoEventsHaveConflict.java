

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DetermineTwoEventsHaveConflict {
    public boolean haveConflict(String[] event1, String[] event2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime time11 = LocalTime.parse(event1[0],formatter);
        LocalTime time12 = LocalTime.parse(event1[1],formatter);

        LocalTime time21 = LocalTime.parse(event2[0],formatter);
        LocalTime time22 = LocalTime.parse(event2[1],formatter);

        return !(time21.isAfter(time12) || time22.isBefore(time11));
    }
}
