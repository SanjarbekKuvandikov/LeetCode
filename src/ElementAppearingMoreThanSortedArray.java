import java.util.Hashtable;
import java.util.Map;

public class ElementAppearingMoreThanSortedArray {
    public int findSpecialInteger(int[] arr) {
        Hashtable<Integer,Integer> hash = new Hashtable<>();
        int per = arr.length / 4;

        for (int num : arr){
            hash.put(num,hash.getOrDefault(num,0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : hash.entrySet()){
            if (entry.getValue() > per) return entry.getKey();
        }

        return 0;
    }
}
