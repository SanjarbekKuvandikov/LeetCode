
public class FinalArrayStateAfterKMultiplicationOperations {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        for (int i = 0 ; i < k; i++){
            int index = firstMin(nums);
            nums[index] = nums[index] * multiplier;
        }

        return nums;
    }
    private int firstMin(int [] num){
        int min = num[0];
        int index  = 0;
        for (int i = 1; i < num.length; i++){
            if (min > num[i]){
                min = num[i];
                index = i;
            }
        }
        return index;
    }
}
