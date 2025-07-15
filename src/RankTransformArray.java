import java.util.Arrays;
import java.util.HashMap;

public class RankTransformArray {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> hash =  new HashMap<>();

        int[] sorted = Arrays.copyOf(arr,arr.length);
        Arrays.sort(sorted);

        int ranks = 1;
        for (int num : sorted){
            if (!hash.containsKey(num)) {
                hash.put(num, ranks++);
            }
        }

        for (int i = 0; i < arr.length; i++){
            int rank = hash.getOrDefault(arr[i],0);
            arr[i] = rank;
        }
        return arr;
    }
}
