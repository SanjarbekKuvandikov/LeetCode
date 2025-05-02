public class MinimumNumberChairsWaitingRoom {
    public int minimumChairs(String s) {
        int numberOfPeople = 0;
        int maxChairs = 1;
        for (char c : s.toCharArray()){
            if (c == 'E'){
                numberOfPeople++;
            }else {
                numberOfPeople--;
            }

            if (numberOfPeople > maxChairs){
                maxChairs++;
            }

        }

        return maxChairs;
    }
}
