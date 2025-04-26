import java.util.HashSet;
import java.util.Set;

public class TheTwoSneakyNumbersDigitville {
    public int[] getSneakyNumbers(int[] nums) {
        int index = 0;
        int [] answer = new int[2];
        Set<Integer> set = new HashSet<>();

        for (int num : nums){
            if (!set.add(num)){
                answer[index] = num;
                index++;
            }
        }

        return answer;
    }
}
