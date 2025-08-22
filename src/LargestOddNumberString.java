public class LargestOddNumberString {
    public String largestOddNumber(String num) {
        int a = Integer.parseInt(num);
        int b = one(num);

        if (a % 2 == 1 && b % 2 == 1){
            return String.valueOf(Math.max(a,b));
        }else if (a % 2 == 1){
            return String.valueOf(a);
        }else if (b % 2 == 1) {
            return String.valueOf(b);
        }

        return "";
    }
    private int one(String num){
        int odd = 0;
        for (char c : num.toCharArray()){
            int n = Integer.parseInt(String.valueOf(c));
            if (n % 2 == 1) odd = n;
        }
        return odd;
    }
}
