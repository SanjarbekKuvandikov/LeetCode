
import java.util.HashMap;

public class MaximumNumberPairsArray {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int num : nums){
            hash.put(num,hash.getOrDefault(num,0) + 1);
        }

        int pairs = 0;
        int no_pairs = 0;

        for (int count : hash.values()) {
            pairs += count / 2;
            no_pairs += count % 2;
        }

        return new int[]{pairs, no_pairs};
    }
}
