import java.util.ArrayList;
import java.util.List;

public class FindtheKorofanArray {
    public int findKOr(int[] nums, int k) {
        int maxLen = 0;
        for (int num : nums){
            int len = Integer.toBinaryString(num).length();
            maxLen = Math.max(maxLen,len);
        }

        List<List<Character>> bits = new ArrayList<>();
        for (int i = 0; i < maxLen; i++) {
            bits.add(new ArrayList<>());
        }

        for (int num : nums) {
            String bin = Integer.toBinaryString(num);

            bin = String.format("%" + maxLen + "s", bin).replace(' ', '0');

            for (int i = 0; i < maxLen; i++) {
                bits.get(i).add(bin.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();

        for (List<Character> bitList : bits) {
            int count = 0;
            for (char c : bitList) {
                if (c == '1') count++;
            }
            result.append(count >= k ? '1' : '0');
        }

        return Integer.parseInt(result.toString(),2);
    }

}
