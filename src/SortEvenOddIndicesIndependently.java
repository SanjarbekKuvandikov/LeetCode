import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEvenOddIndicesIndependently {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if (i % 2 == 0) even.add(nums[i]);
            else odd.add(nums[i]);
        }

        Collections.sort(even);
        odd.sort(Comparator.reverseOrder());

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < nums.length; i++){
            if (i % 2 == 0){
                nums[i] = even.get(evenIndex);
                evenIndex++;
            }
            else {
                nums[i] = odd.get(oddIndex);
                oddIndex++;
            }
        }

        return nums;
    }
}
