public class SortArrayByParityTwo {
    public int[] sortArrayByParityII(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            if (i % 2 != nums[i] % 2){
                int index = checker(i,nums);
                int curr = nums[i];
                nums[i] = nums[index];
                nums[index] = curr;
            }
        }

        return nums;
    }
    private int checker(int index, int[] num){
        for (int i = index + 1; i < num.length; i++){
            if (index % 2 == num[i] % 2 && index % 2 != i % 2) return i;
        }
        return 0;
    }
}