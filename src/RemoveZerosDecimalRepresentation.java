public class RemoveZerosDecimalRepresentation {
    public long removeZeros(long n) {
        long result = 0;
        long ten = 1;
        String str = String.valueOf(n);
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != '0'){
                result += ten * Long.parseLong(String.valueOf(str.charAt(i)));
                ten *= 10;
            }
        }
        return result;
    }
}
