import java.util.Arrays;
import java.util.List;

public class SmallestMissingMultipleK {
    public int missingMultiple(int[] nums, int k) {
        int num = k;
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        while (true){
            if (!list.contains(num)) return num;
            num += k;
        }
    }
}
