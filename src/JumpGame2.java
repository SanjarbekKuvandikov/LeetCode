public class JumpGame2 {
    public int jump(int[] nums) {
        int maxjump = 0;
        int currjump = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length-1; i++) {
            maxjump = Math.max(maxjump, i + nums[i]);
            if (i == currjump) {
                currjump = maxjump;
                cnt++;
            }
        }
        return cnt;
    }
}
