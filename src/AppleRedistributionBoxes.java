import java.util.Arrays;

public class AppleRedistributionBoxes {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = Arrays.stream(apple).sum();
        Arrays.sort(capacity);
        int count = 0;
        for (int i = capacity.length - 1; i >= 0 ; i--) {
            if (sum > 0){
                sum -= capacity[i];
                count++;
            }
        }
        return count;
    }
}
