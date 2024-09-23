public class AlternatingDigitSum {
    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        int sign = 1;
        for (int i = 0; i < s.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(s.charAt(i)));
            sum += sign * digit;
            sign *= -1;
        }
        return sum;
    }
}

