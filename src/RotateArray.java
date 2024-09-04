import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int[] orginal = nums.clone();

        for (int i = 0; i < nums.length; i++) {
            int j = (i+k) % nums.length;
            nums[j] = orginal[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
