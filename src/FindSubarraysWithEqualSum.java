import java.util.HashSet;
import java.util.Set;

public class FindSubarraysWithEqualSum {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> sum = new HashSet<>();
        for (int i = 1; i < nums.length; i++){
            if (!sum.add(nums[i] + nums[i - 1])) return true;
            else sum.add(nums[i] + nums[i - 1]);
        }
        return false;
    }
}
