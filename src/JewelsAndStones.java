import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        char[] chars = jewels.toCharArray();
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (char aChar : chars) {
            set.add(aChar);
        }
        char[] stoneArray = stones.toCharArray();
        for (char c : stoneArray) {
            if (set.contains(c)) {
                count++;
            }
        }
        return count;
    }
}
