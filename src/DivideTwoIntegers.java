class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {

        int answer =0;
        if (divisor == 0){
            return  0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        answer = dividend/divisor;
        if (answer > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        else if(answer < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return  answer;
    }

}