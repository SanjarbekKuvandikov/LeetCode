import java.util.*;

public class MinimumOperationsCollectElements {
    public int minOperations(List<Integer> nums, int k) {
        int minOperation = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = nums.size() -1; i >= 0; i--) {
            set.add(nums.get(i));
            minOperation++;

            if (isInIt(k,set)){
                break;
            }

        }

        return minOperation;
    }

    private boolean isInIt(int k, Set<Integer> set){
        for (int i = 1; i < k; i++){
            if (!set.contains(i)){
                return false;
            }
        }

        return true;
    }
}
