package com.epam;

public class SecondConvertor {
    public String convertor(int sec){
        int hours = (sec/ 3600) %24;
        int minutes = (sec % 3600) / 60;
        int seconds = sec % 60;

        String time = String.format("%01d:%02d:%02d", hours, minutes, seconds);
        return time;
    }
}
