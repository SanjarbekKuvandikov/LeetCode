public class MinimumAmountTimeCollectGarbage {
    public int garbageCollection(String[] garbage, int[] travel) {
        return allTime(garbage) + timeForGarbage('P',garbage,travel) +
                timeForGarbage('G',garbage,travel) +
                timeForGarbage('M',garbage,travel);
    }
    private int allTime(String[] strings){
        var sum = 0;
        for (String str : strings){
            sum += str.length();
        }
        return sum;
    }
    private int timeForGarbage(char type, String[] garbage, int[] travel) {
        int time = 0;
        for (int i = garbage.length - 1; i >= 0; i--) {
            if (garbage[i].indexOf(type) != -1) {

                for (int j = 0; j < i; j++) {
                    time += travel[j];
                }
                return time;
            }
        }
        return 0;
    }
}
