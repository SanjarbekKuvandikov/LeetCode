import java.util.HashMap;
import java.util.List;

public class SubarraysDistinctElementSumSquares {
    public int sumCounts(List<Integer> nums) {
        int distinctCounts = 0;
        int n = nums.size();
        for (int  i = 0; i < n; i++){
            HashMap<Integer,Integer> hash = new HashMap<>();

            for (int j = i; j < n; j++){
                hash.put(nums.get(j),hash.getOrDefault(nums.get(j),0)+1);
                distinctCounts += (int) Math.pow(hash.size(),2.0);
            }
        }

        return distinctCounts;
    }
}
