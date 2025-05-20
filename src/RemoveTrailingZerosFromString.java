public class RemoveTrailingZerosFromString {
    public String removeTrailingZeros(String num) {
        StringBuilder str = new StringBuilder(num);

        for (int i = str.length()-1; i >= 0; i--){
            if (num.charAt(i) != '0'){
                break;
            }else {
                str.deleteCharAt(i);
            }
        }

        return str.toString();
    }
}
