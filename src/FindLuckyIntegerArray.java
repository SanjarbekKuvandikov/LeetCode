
import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerArray {
    public int findLucky(int[] arr) {
        int max = -1;
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int num : arr){
            hash.put(num,hash.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : hash.entrySet()){
            if (entry.getValue().equals(entry.getKey())){
                max = Math.max(max,entry.getKey());
            }
        }

        return max;
    }
}
