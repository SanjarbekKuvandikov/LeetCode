public class SumAllSubsetXORTotals {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }
    private static int dfs(int[] num, int index, int currentXor){
        if (index == num.length) {
            return currentXor;
        }

        int exclude = dfs(num, index + 1, currentXor);

        int include = dfs(num, index + 1, currentXor ^ num[index]);

        return exclude + include;
    }
}
