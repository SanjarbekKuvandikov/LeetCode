public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink = numBottles;
        int emptyBottles = numBottles;
        while (emptyBottles >= numExchange){
            emptyBottles -= numExchange;
            drink++;
            emptyBottles++;
        }
        return drink;
    }
}
