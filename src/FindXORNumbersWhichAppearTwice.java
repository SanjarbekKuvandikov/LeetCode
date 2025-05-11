import java.util.HashMap;
import java.util.Map;

public class FindXORNumbersWhichAppearTwice {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();

        for (int num : nums){
            hash.put(num,hash.getOrDefault(num,0) + 1);
        }
        int xor = 0;
        for (Map.Entry<Integer,Integer> entry: hash.entrySet()){
            if (entry.getValue() > 1){
                xor ^= entry.getKey();
            }
        }

        return xor;
    }
}
