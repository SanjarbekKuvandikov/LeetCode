public class MajorityElement {
    public int majorityElement(int[] nums) {
        int newlength = nums.length / 2;
        Integer majorityElement = null;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > newlength) {
                majorityElement = nums[i];
                break;
            }
        }

    return majorityElement;
    }
}
