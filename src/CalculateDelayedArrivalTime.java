public class CalculateDelayedArrivalTime {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int newTime = arrivalTime + delayedTime;

        if (newTime == 24){
            return 0;
        }else if (newTime > 24){
            return newTime - 24;
        }

        return newTime;
    }
}
