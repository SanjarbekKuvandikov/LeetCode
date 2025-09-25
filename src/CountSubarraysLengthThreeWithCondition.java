

public class CountSubarraysLengthThreeWithCondition {
    public int countSubarrays(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (isExist(i - 1,i,i + 1,nums)){
                count++;
            }
        }
        return count;
    }
    private boolean isExist(int first, int second,int third,int[] arr){
        if (first < arr.length && second < arr.length && third < arr.length){
            int sum = arr[first] + arr[third];
            return sum * 1.0 == arr[second] * 1.0 / 2;
        }
        return false;
    }
}
