public class MinimumCostMoveChipsTheSamePosition {
    public int minCostToMoveChips(int[] position) {
        int index = 0, max = position[0];
        int minCost = 0;

        for (int i = 0; i < position.length; i++){
            if (max < position[i]){
                max = position[i];
                index = i;
            }
        }

        for (int i = 0; i < index; i++){
            if (position[index] - position[i] == 1) minCost++;
        }

        return minCost;
    }
}
