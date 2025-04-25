public class DivisibleNonDivisibleSumsDifference {
    public int differenceOfSums(int n, int m) {
        int sumOne = 0;
        int sumTwo = 0;
        for (int i = 1; i <= n; i++){
            if (i  % m == 0){
                sumTwo += i;
            }else {
            sumOne += i;
            }
        }

        return sumOne - sumTwo;
    }
}
