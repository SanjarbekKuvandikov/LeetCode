public class ReformatPhoneNumber {
    public String reformatNumber(String number) {
        StringBuilder str = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (char c : number.toCharArray()){
            if (Character.isDigit(c)){
               str.append(c);
            }
        }
        int length = str.length();
        int i = 0;

        while (length > 0){
            if (length > 4){
                result.append(str, i, i + 3).append("-");
                i += 3;
                length -= 3;
            }
            else if (length == 4){
                result.append(str, i, i + 2).append("-");
                result.append(str, i + 2, i + 4);
                length = 0;
            }
            else {
                result.append(str, i, i + length);
                length = 0;
            }
        }

        if (result.charAt(result.length() - 1) == '-') {
            result.deleteCharAt(result.length() - 1);
        }

        return result.toString();
    }
}
