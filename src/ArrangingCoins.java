public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int coins = 0;
        int max = n;
        for(int i = 1; i <= n; i++){
            if(max >= i){
                max -= i;
                coins = i;
            }else {
                return coins;
            }
        }
        return 0;
    }
}
