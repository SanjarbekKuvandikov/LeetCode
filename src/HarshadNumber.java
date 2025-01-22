public class HarshadNumber {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        if (x <= 0){
            return -1;
        }
        int number = x;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        if (x % sum == 0){
            return sum;
        }else return -1;
    }
}
