public class MinimumCostReachEveryPosition {
    public int[] minCosts(int[] cost) {
        int n = cost[0];
        for (int i = 0; i < cost.length; i++){
                int cur = cost[i];
                cost[i] = Math.min(n,cur);
                n = cost[i];
        }
        return cost;
    }
}
