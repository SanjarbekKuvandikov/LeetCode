public class CheckBalancedString {
    public boolean isBalanced(String num) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < num.length(); i++){
            int j = num.charAt(i) - '0';
            if (i % 2 == 0){
                even += j;
            }else {
                odd += j;
            }
        }
        return even == odd;
    }
}
