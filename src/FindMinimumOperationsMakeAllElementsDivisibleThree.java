public class FindMinimumOperationsMakeAllElementsDivisibleThree {
    public int minimumOperations(int[] nums) {
        int count = 0;

        for (int num : nums){
            int add = num + 1;
            int subtract =  num - 1;

            if (add % 3 == 0 || subtract % 3 == 0){
                count++;
            }
        }

        return count;
    }
}
