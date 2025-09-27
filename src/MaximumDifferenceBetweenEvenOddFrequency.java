import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class MaximumDifferenceBetweenEvenOddFrequency {
    public int maxDifference(String s) {
        Hashtable<Character,Integer> hash = new Hashtable<>();
        for (char c : s.toCharArray()){
            hash.put(c, hash.getOrDefault(c,0) + 1);
        }
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (Map.Entry<Character,Integer> entry : hash.entrySet()){
            if (entry.getValue() % 2 == 0) even.add(entry.getValue());
            else odd.add(entry.getValue());
        }

        int maxDiff = Integer.MIN_VALUE;
        for (Integer integer : odd) {
            for (Integer value : even) {
                maxDiff = Math.max(maxDiff, Math.abs(integer - value));
            }
        }

        return maxDiff;
    }
}
