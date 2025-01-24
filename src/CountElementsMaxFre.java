import java.util.HashMap;
import java.util.Map;

public class CountElementsMaxFre {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> elements = new HashMap<>();
        for (int num : nums) {
            elements.put(num, elements.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        for (int freq : elements.values()) {
            max = Math.max(max, freq);
        }
        int sum = 0;
        for (int freq : elements.values()) {
            if (freq == max) {
                sum += freq;
            }
        }
        return sum;
    }
}
