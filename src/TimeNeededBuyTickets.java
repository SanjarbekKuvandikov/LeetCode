

public class TimeNeededBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        while (true){
            for (int i = 0; i < tickets.length; i++){
                if (tickets[i] > 0){
                tickets[i] = tickets[i] -1;
                count++;
                }
                if (tickets[k] == 0){
                    return count;
                }
            }
        }
    }
}
