public class LatestTimeReplacingHiddenDigits {
    public String maximumTime(String time) {
        char hour1 = time.charAt(0);
        char hour2 = time.charAt(1);

        char minute1 = time.charAt(3);
        char minute2 = time.charAt(4);

        StringBuilder str = new StringBuilder();

        if (hour1 == '?' && hour2 != '?'){
            int hour2Int = hour2 - '0';
            if (hour2Int <= 3){
                str.append(2).append(hour2);
            }else str.append(1).append(hour2);
        }
         if (hour1 != '?' && hour2 == '?'){
            int hour1Int = hour1 - '0';
            if (hour1Int == 2) str.append(hour1).append(3);
            else str.append(hour1).append(9);
        }
         if (hour1 == '?' && hour2 == '?'){
            str.append(23);
        }
        if (hour1 != '?' && hour2 != '?'){
            str.append(hour1).append(hour2);
        }

         str.append(':');

        if (minute1 == '?' && minute2 != '?'){
            str.append(5).append(minute2);
        }
        if (minute1 != '?' && minute2 == '?'){
            str.append(minute1).append(9);
        }
        if (minute1 == '?' && minute2 == '?'){
            str.append(59);
        }
        if (minute1 != '?' && minute2 != '?'){
            str.append(minute1).append(minute2);
        }

        return str.toString();
    }
}
