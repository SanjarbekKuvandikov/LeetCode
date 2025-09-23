public class AccountBalanceAfterRoundedPurchase {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        return 100 - roundedAmount(purchaseAmount);
    }
    private int roundedAmount(int purchase){
        int last;
        if (purchase < 10){
            last = purchase;
        }else {
            last = purchase % 10;
        }
        if (last >= 5){
            int ten = 10 - last;
            return purchase + ten;
        }
        return purchase - last;
    }
}
