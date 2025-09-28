public class DivideStringIntoGroupsSize {
    public String[] divideString(String s, int k, char fill) {
        int n;
        if (s.length() % k != 0){
            n = s.length() / k + 1;
        }
        else {
            n = s.length() / k;
        }
        String[] str = new String[n];
        int length = 0;
        for (int i = 0; i < str.length; i++) {
            int count = 0;
            StringBuilder strb = new StringBuilder();
            while (count < k){
                if (length < s.length()){
                    strb.append(s.charAt(length));
                }
                else {
                    strb.append(fill);
                }
                count++;
                length++;
            }
            str[i] = strb.toString();
            strb.setLength(0);
        }
        return str;
    }
}
