public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                int a = nums[i]; //4
                int b = nums[index];
                nums[index] = a;
                nums[i] = b;
                index++;
            }
        }
        return nums;
    }
}
