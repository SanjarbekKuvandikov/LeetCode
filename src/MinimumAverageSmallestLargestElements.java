import java.util.Arrays;

public class MinimumAverageSmallestLargestElements {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double [] result = new double[nums.length / 2];
        int first = 0;
        int last = nums.length - 1;
        while (first < last){
            double avg = (double) (nums[first] + nums[last]) / 2;
            result[first] = avg;
            first++;
            last--;
        }
        Arrays.sort(result);
        return result[0];
    }
}
