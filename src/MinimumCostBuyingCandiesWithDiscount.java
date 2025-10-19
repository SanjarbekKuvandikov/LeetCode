import java.util.Arrays;

public class MinimumCostBuyingCandiesWithDiscount {
    public int minimumCost(int[] cost) {
        int minCost = Arrays.stream(cost).sum();
        Arrays.sort(cost);
        System.out.println(Arrays.toString(cost));
        int count = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            if (count == 2){
                minCost -= cost[i];
                System.out.println(cost[i]);
                count = -1;
            }
            count++;
        }
        return minCost;
    }
}
