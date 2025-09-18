import java.util.Arrays;

public class MinimumAmountTimeFillCups {
    public int fillCups(int[] amount) {
        int count = 0;
        while (!allZero(amount)){
            Arrays.sort(amount);

             if (amount[1] > 0 && amount[2] > 0){
                amount[1]--;
             }
            amount[2]--;
            count++;
        }
        return count;
    }
    private boolean allZero(int[] amount){
        for (int n : amount){
            if (n > 0) return false;
        }
        return true;
    }
}
