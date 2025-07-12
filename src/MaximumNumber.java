public class MaximumNumber {
    public int maximum69Number (int num) {
        int replaced = checker(String.valueOf(num));
        while (num > replaced){
            replaced = checker(String.valueOf(replaced));
        }
        return replaced;
    }
    private int checker(String word){
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(chars));
    }
}
