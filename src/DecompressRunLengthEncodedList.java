import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.length; i +=2){
            int n = nums[i - 1];
            while (n > 0){
                list.add(nums[i]);
                n--;
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
