import java.util.*;

public class FindTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer>  result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                    result.add(i);
            }
        }
        return result;
    }
}
