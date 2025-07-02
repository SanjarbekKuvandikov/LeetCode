
public class CheckNumberHasEqualDigitCountDigitValue {
    public boolean digitCount(String num) {
        for (int i = 0; i < num.length(); i++){
            int count = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (checker((char)(i + '0'),num) != count){
                return false;
            }

        }
        return true;
    }
    private int checker(char i,String num){
        int count = 0;
        for (char c : num.toCharArray()){
            if (c == i){
                count++;
            }
        }
        return count;
    }
}
