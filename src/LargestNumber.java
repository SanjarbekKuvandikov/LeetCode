import java.util.Arrays;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        String[] numsStr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsStr[i] = String.valueOf(nums[i]);
        }
        // Sort the array using a custom comparator
        Arrays.sort(numsStr, (a, b) -> (b + a).compareTo(a + b));
        // Edge case: if the largest number is "0", return "0"
        if (numsStr[0].equals("0")) {
            return "0";
        }
        // Join the sorted strings into a single result
        StringBuilder result = new StringBuilder();
        for (String num : numsStr) {
            result.append(num);
        }
        return result.toString();
    }
}
