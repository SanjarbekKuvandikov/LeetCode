public class FinalPricesWithSpecialDiscountShop {
    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++){
            int num = 0;
            for (int j = i + 1; j < prices.length; j++){
                if (prices[i] >= prices[j]){
                    num = prices[j];
                    break;
                }
            }
            prices[i] = prices[i] - num;
        }

        return prices;
    }
}
