

public class NumberLinesToWriteString {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int sum = 0;
        for (char c : s.toCharArray()){
            int  w = widths[c - 'a'];
            if ((sum + w) > 100){
                lines++;
                sum = w;
            }
            else {
                sum += w;
            }
        }
        return new int[] {lines,sum};
    }
}
