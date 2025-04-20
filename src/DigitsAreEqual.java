public class DigitsAreEqual {
    public boolean hasSameDigits(String s) {
        while (s.length() > 2){
            s = sum(s);
        }
        int digit = Integer.parseInt(s);
        return (digit / 10) % 10 == digit % 10;
    }
    private String sum(String s){
        StringBuilder string = new StringBuilder();
        for (int i = 1; i < s.length(); i++){
            int sum =  (Integer.parseInt(String.valueOf(s.charAt(i-1))) + Integer.parseInt(String.valueOf(s.charAt(i)))) % 10;
            string.append(sum);
        }
        return string.toString();
    }
}
