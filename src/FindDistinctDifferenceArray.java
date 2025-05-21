import java.util.HashSet;
import java.util.Set;

public class FindDistinctDifferenceArray {
    public int[] distinctDifferenceArray(int[] nums) {
        int [] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            result[i] = firstDistinctCount(i,nums) - lastDistinctCount(i+1,nums);
        }

        return result;
    }

    private int firstDistinctCount(int n, int[] num){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= n; i++){
            set.add(num[i]);
        }

        return set.size();
    }

    private int lastDistinctCount(int n, int[] num){
        Set<Integer> set = new HashSet<>();
        for (int i = n; i < num.length; i++){
            set.add(num[i]);
        }

        return set.size();
    }
}
