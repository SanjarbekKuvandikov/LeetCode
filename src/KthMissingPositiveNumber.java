import java.util.Arrays;
import java.util.List;

public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        int index = 1;
        int count = 0;
        while (index > 0){

            if (!list.contains(index)){
                count++;
            }
            if (count == k){
                return index;
            }

            index++;
        }
        return 0;
    }
}
