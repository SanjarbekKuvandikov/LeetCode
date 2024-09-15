public class StringtoInteger {
    public int myAtoi(String s) {
        boolean minusOrPlus = false;
        String num = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && num.isEmpty()) continue;
            if ((s.charAt(i)>='0' && s.charAt(i)<= '9') || (!minusOrPlus && (s.charAt(i) == '-' || s.charAt(i) == '+'))){
                num += s.charAt(i);
                minusOrPlus = true;
            }
            else break;
        }

        if (num.isEmpty() || num.equals("-") || num.equals("+")) return 0;

        try {
             return Integer.parseInt(num);
        } catch (NumberFormatException e) {
            if (s.contains("-")) return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }

    }
}
