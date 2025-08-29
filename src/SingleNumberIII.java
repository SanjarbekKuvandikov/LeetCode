import java.util.ArrayList;
import java.util.List;

public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if (check(i,nums)){
                result.add(nums[i]);
            }
        }
        int[] arr = new int[result.size()];
        for (int i =0 ;i < arr.length; i++){
            arr[i] = result.get(i);
        }
        return arr;
    }
    private boolean check(int index, int[] num){
        for (int i = 0; i < num.length; i++){
            if (i != index && (num[i] ^ num[index]) == 0) {
                return false;
            }
        }
        return true;
    }
}
