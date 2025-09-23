import java.util.Hashtable;
import java.util.Map;

public class FindTheLeastFrequentDigit {
    public int getLeastFrequentDigit(int n) {
        Hashtable<Integer,Integer> hash = new Hashtable<>();
        while (n > 0){
            int on = n % 10;
            hash.put(on,hash.getOrDefault(on,0) + 1);
            n /= 10;
        }
        int min = Integer.MAX_VALUE;
        int num = 0;
        for (Map.Entry<Integer,Integer> entry : hash.entrySet()){
            if (entry.getValue() < min || (entry.getValue() == min && entry.getKey() < num)) {
                min = entry.getValue();
                num = entry.getKey();
            }
        }
        return num;
    }
}
