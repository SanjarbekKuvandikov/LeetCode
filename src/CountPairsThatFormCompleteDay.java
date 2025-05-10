public class CountPairsThatFormCompleteDay {
    public int countCompleteDayPairs(int[] hours) {
        int count = 0;
        int first = 0;
        int second = 1;

        while (first < hours.length && second < hours.length){

            for (int i = second; i < hours.length; i++){
                if ((hours[first] + hours[i]) % 24 == 0){
                    count++;
                }
            }

            first++;
            second++;
        }

        return count;
    }
}
