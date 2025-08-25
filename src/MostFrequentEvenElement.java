import java.util.Hashtable;
import java.util.Map;

public class MostFrequentEvenElement {
    public int mostFrequentEven(int[] nums) {
        int freq = 0, num = -1;
        Hashtable<Integer,Integer> hash = new Hashtable<>();
        for (int n : nums){
            if (n % 2 == 0) {
                hash.put(n, hash.getOrDefault(n, 0) + 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : hash.entrySet()){
            if (entry.getValue() > freq){
                freq = entry.getValue();
                num = entry.getKey();
            }else if (entry.getValue() == freq){
                num = Math.min(num,entry.getKey());
            }
        }
        return num;
    }
}
