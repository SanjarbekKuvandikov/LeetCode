public class NumberComplement {
    public int findComplement(int num) {
        String string = Integer.toBinaryString(num);
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
