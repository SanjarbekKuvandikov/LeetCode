import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for(int i = 1; i < nums.length; i+=2){
            max += Math.min(nums[i],nums[i - 1]);
        }
        return max;
    }
}
