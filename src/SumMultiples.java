public class SumMultiples {
    public int sumOfMultiples(int n) {
        int first = 1;
        int sumOdds = 0;
        while (first <= n){
            if (first % 3 == 0 || first % 5 == 0 || first % 7 == 0){
                sumOdds += first;
            }
            first++;
        }

        return sumOdds;
    }
}
