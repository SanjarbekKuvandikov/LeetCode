public class MinimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int min = 0;
        for (int i = 1; i < points.length; i++){
            int x = (Math.abs(points[i - 1][0] - points[i][0]));
            int y = (Math.abs(points[i - 1][1] - points[i][1]));
            min += Math.max(x,y);
        }
        return min;
    }
}
