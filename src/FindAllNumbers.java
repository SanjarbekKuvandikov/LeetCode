import java.util.ArrayList;
import java.util.List;
public class FindAllNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            nums[index] = -Math.abs(nums[index]);
        }
        int index = 1;
        for (int num : nums) {
            if (num > 0) {
                result.add(index);
            }
            index++;
        }
        return result;
    }
}
