public class ComplementOfBase10Integer {
    public int bitwiseComplement(int n) {
        String string = Integer.toBinaryString(n);
        StringBuilder bits = new StringBuilder();
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == '0'){
                bits.append('1');
            }
            else {
                bits.append('0');
            }
        }
        return Integer.parseInt(String.valueOf(bits), 2);
    }
}
