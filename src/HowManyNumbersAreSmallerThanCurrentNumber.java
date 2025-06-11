public class HowManyNumbersAreSmallerThanCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++){
            result[i] = howMuch(nums[i],nums);
        }

        return result;
    }
    private int howMuch(int n, int[] num){
        int count = 0;
        for (int nu : num){
            if (n > nu) count++;
        }

        return count;
    }
}
