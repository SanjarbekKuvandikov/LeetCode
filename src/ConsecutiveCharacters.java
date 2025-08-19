

public class ConsecutiveCharacters {
    public int maxPower(String s) {
        if (s.length() == 1) return 1;
        int count = 1;
        int max = 0;
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) != s.charAt(i - 1)){
                max = Math.max(max,count);
                count = 1;
            }else {
                count++;
            }
        }
        max = Math.max(max,count);
        return  max;
    }
}
