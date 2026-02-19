import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElements {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        List<Integer> arr = Arrays.stream(nums)
                        .boxed().toList();
        Arrays.sort(nums);
        for (int i = nums[0]; i <= nums[nums.length - 1] ; i++) {
            if(!arr.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}
