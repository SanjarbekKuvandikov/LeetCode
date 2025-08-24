public class LargestOddNumberString {
    public String largestOddNumber(String num) {
        StringBuilder str = new StringBuilder();
        int len = 1;
        while (len <= num.length()){
            String sub = num.substring(0,len);
            int last = sub.length() - 1;
            int number = Integer.parseInt(String.valueOf(sub.charAt(last)));
            if (number % 2 == 1){
                if (str.length() < sub.length()){
                    str.setLength(0);
                    str.append(sub);
                }
            }
            len++;
        }
        return str.toString();
    }
}
