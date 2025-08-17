public class ThousandSeparator {
    public String thousandSeparator(int n) {
        StringBuilder str = new StringBuilder(String.valueOf(n));
        if (str.length() <= 3){
            return str.toString();
        }
        int i = str.length();
        while (i > 3) {
            i -= 3;
            str.insert(i, '.');
        }
        return str.toString();
    }
}
