public class PercentageLetterString {
    public int percentageLetter(String s, char letter) {
        int n = s.length();
        int count = 0;

        for (char c : s.toCharArray()){
            if (c == letter){
                count++;
            }
        }
        if (count == 0){
            return 0;
        }

        return (int) ((count * 100.0) / n);
    }
}
