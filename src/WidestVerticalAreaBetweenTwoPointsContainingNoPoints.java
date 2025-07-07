import java.util.Arrays;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] x = new int[points.length];

        for (int i = 0 ;i < x.length; i++){
            x[i] = points[i][0];
        }

        Arrays.sort(x);
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < x.length; i++){
            max = Math.max(max,x[i] - x[i - 1]);
        }

        return max;
    }
}
