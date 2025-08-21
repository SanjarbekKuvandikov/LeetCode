public class FindClosestNumberZero {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        for(int num : nums){
            if (min > Math.abs(num)){
                min = Math.abs(num);
                result = num;
            }
            else if(min == num){
                result = Math.max(result,num);
            }
        }
        return result;
    }
}
