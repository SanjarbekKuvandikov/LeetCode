import java.util.*;

public class IntersectionMultipleArrays {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<>();
        Hashtable<Integer,Integer> hash = new Hashtable<>();

        for (int[] num : nums){
            for (int n : num){
                hash.put(n,hash.getOrDefault(n,0) + 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : hash.entrySet()){
            if (entry.getValue() == nums.length) list.add(entry.getKey());
        }
        Collections.sort(list);
        return list;
    }
}
