public class NumberValidClockTimes {
    public int countTime(String time) {
        char hours1 = time.charAt(0);
        char hours2 = time.charAt(1);

        char minutes1 = time.charAt(3);
        char minutes2 = time.charAt(4);

        int minutesPoss = 1;
        int hoursPoss = 1;

        if ((hours1 == '?' && hours2 == '?')){
            hoursPoss = 24;
        }else if (hours1 == '?'){
            hoursPoss = firstHours(hours2);
        }
        else if (hours2 == '?'){
            hoursPoss = secondHours(hours1);
        }

        if (minutes1 == '?' && minutes2 == '?'){
            minutesPoss = 60;
        }else if (minutes1 == '?'){
            minutesPoss = 6;
        }else if (minutes2 == '?'){
            minutesPoss = 10;
        }

        return hoursPoss * minutesPoss;
    }
    private int firstHours(char a){
        int num = Integer.parseInt(String.valueOf(a));
        if (num == 5 || num == 4) return 2;

        return 3;
    }
    private int secondHours(char a){
        int num = Integer.parseInt(String.valueOf(a));
        if (num == 1 || num == 0) return 0;

        return 4;
    }
}
