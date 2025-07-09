import java.util.List;

public class ConstructMinimumBitwiseArray {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] result = new int[nums.size()];
        for (int i = 0; i < result.length; i++){
            result[i] = checker(nums.get(i));
        }
        return result;
    }
    private int checker(int num){
        for (int i = 1; i <= num; i++){
            int j = i + 1;
            if ((i | j) == num){
                return i;
            }
        }
        return - 1;
    }
}
