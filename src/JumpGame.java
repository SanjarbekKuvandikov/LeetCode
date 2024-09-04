public class JumpGame {
    public boolean canJump(int[] nums) {
boolean ifcan =false;
        int index = nums.length-1;
        for (int i=nums.length-2 ; i>=0; i--) {
            if (i+nums[i] >= index) {
                index = i;
            }
        }
        if (index ==0){
            ifcan =true;
        }
        return ifcan;
    }
}
