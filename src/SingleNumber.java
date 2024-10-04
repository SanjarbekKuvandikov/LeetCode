public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int index = 0;
        int [] nums2 = new int[nums.length];
        for (int i=0;i< nums.length;i++){
            index = index ^ nums[i];
            if (i>0) {
                nums2[i] = index;
            }
        }
        return nums2[nums2.length-1];
    }
}
