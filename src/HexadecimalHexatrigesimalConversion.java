public class HexadecimalHexatrigesimalConversion {
    public String concatHex36(int n) {
        int kv = n * n;
        int kub = n * n * n;
        String hexadecimal = Integer.toHexString(kv).toUpperCase();
        String hexatrigesimal = Integer.toString(kub,36).toUpperCase();

        return hexadecimal + hexatrigesimal;
    }
}
