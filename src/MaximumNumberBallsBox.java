import java.util.Hashtable;

public class MaximumNumberBallsBox {
    public int countBalls(int lowLimit, int highLimit) {
        Hashtable<Integer,Integer> hash = new Hashtable<>();
        int max = 0;

        for (int i = lowLimit; i <= highLimit; i++){
            int sum = digitSum(i);

            hash.put(sum,hash.getOrDefault(sum,0)+1);

            max = Math.max(max,hash.get(sum));

        }

        return max;
    }
    private int digitSum(int n){
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
