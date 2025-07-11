import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++){
            min = Math.min(min,(arr[i] - arr[i - 1]));
        }
        for (int i = 1; i < arr.length; i++){
            if (min == (arr[i] - arr[i - 1])) {
                result.add(List.of(arr[i - 1], arr[i]));
            }
        }

        return result;
    }
}
