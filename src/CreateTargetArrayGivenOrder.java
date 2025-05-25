import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            list.add(index[i],nums[i]);
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++){
            result[i] = list.get(i);
        }

        return result;
    }
}
