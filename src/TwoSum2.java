public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer =  new int[2];
       int right =numbers.length-1;
       int left = 0;
       while (left <right){
           int sumup = (numbers[left] + numbers[right]);
           if (target == sumup){
               answer[0] = left;
               answer[1] = right;
               break;
           }
           else if(sumup<target){
               left++;
           }
           else {
               right--;
           }
       }
        return answer;
    }
}
