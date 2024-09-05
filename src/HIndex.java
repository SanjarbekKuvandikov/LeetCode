import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        //0 1 3 5 6 length=5
        for (int i = 0; i < citations.length; i++) {
            if (citations[i]>=citations.length - i) return citations.length - i;
        }
        return 0;
    }
}
