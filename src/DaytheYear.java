public class DaytheYear {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0,4));
        int month = months(date.substring(5,7),year);
        int day = Integer.parseInt(date.substring(8));

        return  day + month;
    }
    private int months(String str,int year) {
        int feb = isLeapYear(year) ? 60 : 59;
        switch (str) {
            case "01" -> {
                return 0;
            }
            case "02" -> {
                return 31;
            }
            case "03" -> {
                return feb;
            }
            case "04" -> {
                return feb + 31;
            }
            case "05" -> {
                return feb + 61;
            }
            case "06" -> {
                return feb + 92;
            }
            case "07" -> {
                return feb + 122;
            }
            case "08" -> {
                return feb + 153;
            }
            case "09" -> {
                return feb + 184;
            }
            case "10" -> {
                return feb + 214;
            }
            case "11" -> {
                return feb + 245;
            }
            case "12" -> {
                return feb + 275;
            }
        }
        return 0;
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
