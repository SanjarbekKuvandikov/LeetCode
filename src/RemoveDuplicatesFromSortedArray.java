import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int cnt = 1;
        int temp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == temp && k<2){
                temp = nums[i];
                nums[cnt] = temp;
                k++;
                cnt++;
            }else if (nums[i] != temp){
                temp = nums[i];
                nums[cnt] = temp;
                k = 1;
                cnt++;
            }
        }

        return cnt;
    }



    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesFromSortedArray remove = new RemoveDuplicatesFromSortedArray();
        System.out.println(remove.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

}
