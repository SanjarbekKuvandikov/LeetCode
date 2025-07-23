
public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;
        for (int i = 1 ; i < timeSeries.length; i++){
            int diff = timeSeries[i] - timeSeries[i - 1];
            sum += Math.min(diff,duration);
        }
        return sum + duration;
    }
}
