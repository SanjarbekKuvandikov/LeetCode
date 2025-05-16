import java.util.ArrayList;
import java.util.List;

public class MaximumStrongPairXOR {
    public int maximumStrongPairXor(int[] nums) {
        List<Integer> listx = new ArrayList<>();
        List<Integer> listy = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[i],nums[j])){
                    listx.add(nums[i]);
                    listy.add(nums[j]);
                }
            }
        }
        int max = 0;

        for (int i = 1; i < listx.size(); i++){
            max = Math.max(max, listx.get(i) ^ listy.get(i));
        }

        return max;
    }
}
