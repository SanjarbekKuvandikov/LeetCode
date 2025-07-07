public class ApplyOperationsArray {
    public int[] applyOperations(int[] nums) {

        for (int i = 1; i < nums.length; i++){
            if (nums[i - 1] == nums[i]){
                nums[i - 1] = 2 * nums[i - 1];
                nums[i] = 0;
            }
        }

        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }

        return nums;
    }

}
