
import java.util.*;

public class DegreeArray {
    public int findShortestSubArray(int[] nums) {
        Hashtable<Integer,Integer> hash = new Hashtable<>();

        for (int num : nums){
            hash.put(num,hash.getOrDefault(num,0) + 1);
        }

        int degree = Collections.max(hash.values());
        List<Integer> contains = new ArrayList<>();

        for (Map.Entry<Integer,Integer> entry : hash.entrySet()){
            if (degree == entry.getValue()){
                contains.add(entry.getKey());
            }
        }

        int min = Integer.MAX_VALUE;
        for (int num : contains){

            int i = 0;
            int j = nums.length - 1;
            while (i < j){
                if (nums[i] != num) i++;
                if (nums[j] != num) j--;

                if (nums[i] == num && nums[j] == num){
                    min = Math.min(min,j - i + 1);
                    break;
                }
            }

            if (i == j && nums[i] == num) {
                min = Math.min(min, 1);
            }

        }

        return min;
    }
}
