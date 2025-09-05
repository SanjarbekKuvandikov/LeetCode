public class MinimumCostMoveChipsTheSamePosition {
    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        int even = 0;
        for(int num : position){
            if(num % 2 == 0) odd++;
            else even++;
        }
        return Math.min(odd,even);
    }
}
