import java.util.Arrays;

public class LargestPositiveInteger {
    public int findMaxK(int[] nums) {
      Arrays.sort(nums);
      int left = 0, right = nums.length-1;
      while (left < right){
          int mid = nums[left] + nums[right];
          if (nums[left] < 0 && (-1) * nums[left] == nums[right]){
              return nums[right];
          }
          if (mid > 0) right--;
          else left++;

      }
        return -1;
    }
}
