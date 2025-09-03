import java.util.Hashtable;
import java.util.Map;

public class FormSmallestNumberFromTwoDigitArrays {
    public int minNumber(int[] nums1, int[] nums2) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        Hashtable<Integer,Integer> hash = new Hashtable<>();

        for (int num : nums1){
            min1 = Math.min(min1,num);
            hash.put(num,hash.getOrDefault(num,0) + 1);
        }

        for (int num : nums2){
            min2 = Math.min(min2,num);
            hash.put(num,hash.getOrDefault(num,0) + 1);
        }
        int minHash = Integer.MAX_VALUE;
        for (Map.Entry<Integer,Integer> entry : hash.entrySet()){
            if (entry.getValue() == 2){
               minHash = Math.min(minHash,entry.getKey());
            }
        }
        StringBuilder str = new StringBuilder();
        if (min1 > min2) str.append(min2).append(min1);
        else str.append(min1).append(min2);

        return minHash != Integer.MAX_VALUE ? minHash : Integer.parseInt(str.toString());
    }
}
