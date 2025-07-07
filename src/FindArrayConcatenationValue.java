public class FindArrayConcatenationValue {
    public long findTheArrayConcVal(int[] nums) {
        int first = 0;
        int last = nums.length - 1;
        long sum = 0;
        while (first < last){
            sum += Integer.parseInt(nums[first] + "" + nums[last]);
            first++;
            last--;
        }if (nums.length % 2 == 1){
            sum += nums[first];
        }
        return sum;
    }
}
