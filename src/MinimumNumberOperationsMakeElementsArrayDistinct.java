import java.util.*;

public class MinimumNumberOperationsMakeElementsArrayDistinct {
    public int minimumOperations(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums){
            list.add(num);
        }

        int count = 0;
        while (!checker(list)) {
            if (Math.min(3, list.size()) > 0) {
                list.subList(0, Math.min(3, list.size())).clear();
            }
            count++;
        }

        return count;
    }
    private boolean checker(List<Integer> list){
        Set<Integer> set = new HashSet<>();
        for (int n : list){
            if (n > 0){
                if (!set.add(n)) return false;
            }
        }

        return true;
    }
}
