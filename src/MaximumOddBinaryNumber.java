public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        int zeros = 0;
        for (char chars : s.toCharArray()){
            if (chars == '1'){
                ones ++;
            }else {
                zeros++;
            }
        }
        StringBuilder result = new StringBuilder();
        result.append('1');
        ones = ones -1;
         while (ones > 0 || zeros > 0){
             if(zeros == 0){
                 result.append('1');
                 ones --;
             }
             if (zeros > 0){
             result.append('0');
             zeros--;
             }
         }

         result.reverse();
         return result.toString();
    }
}
