import java.util.Arrays;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 3) {
            return nums[nums.length - 1];
        }
        int index = Integer.MIN_VALUE;
        int third = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (third == 3) {
                break;
            } else if (nums[i] != index) {
                index = nums[i];
                third++;
            }
        }
        if (third == 2) {
            return nums[nums.length - 1];
        }
        return index;
    }
}
