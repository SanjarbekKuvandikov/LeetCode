import java.util.HashMap;
import java.util.Map;

public class MaximumLengthSubstringWithTwoOccurrences {
    public int maximumLengthSubstring(String s) {
        int left = 0, max = 0;
        Map<Character, Integer> count = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            count.put(c, count.getOrDefault(c, 0) + 1);

            while (count.get(c) > 2) {
                char leftChar = s.charAt(left++);
                count.put(leftChar, count.get(leftChar) - 1);
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
