import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NumberOfRectanglesThatCanFormTheLargestSquare {
    public int countGoodRectangles(int[][] rectangles) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int[] rect : rectangles){
            int min = Math.min(rect[0],rect[1]);
            list.add(min);
        }
        list.sort(Comparator.reverseOrder());
        int maxLength = list.get(0);

        for (int[] rect : rectangles){
            if(rect[0] >= maxLength && rect[1] >= maxLength){
                count++;
            }
        }
        return count;
    }
}
