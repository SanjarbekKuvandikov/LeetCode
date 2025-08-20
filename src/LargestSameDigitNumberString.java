
public class LargestSameDigitNumberString {
    public String largestGoodInteger(String num) {
        int max = 0;
        for (int i = 1; i < num.length(); i++){
            char first = num.charAt(i - 1);
            char second = num.charAt(i);
            if (first == second){
                if ((i + 1) <= num.length() && first == num.charAt(i + 1)){
                    int number = Integer.parseInt(String.valueOf(first));
                    max = Math.max(number,max);
                }
            }
        }
        if (max == 0) return "";
        return String.valueOf(max).repeat(3);
    }
}
