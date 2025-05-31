public class CalculateMoneyLeetcodeBank {
    public int totalMoney(int n) {
        int profit = 0;
        int count = 0;
        int dollar = 1;

        while (n > 0){
             profit += dollar + count;
             count++;
             n--;

             if (count == 7){
                 dollar += 1;
                 count = 0;
             }
        }

        return profit;
    }

}
