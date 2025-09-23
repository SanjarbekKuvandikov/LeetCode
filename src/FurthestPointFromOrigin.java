public class FurthestPointFromOrigin {
    public int furthestDistanceFromOrigin(String moves) {
        return Math.max(left(moves),right(moves));
    }
    private int left(String moves){
        int right = 0;
        int left = 0;
        for (char c : moves.toCharArray()){
            if (c == 'R') right++;
            else left++;
        }
        return Math.abs(right - left);
    }
    private int right(String moves){
        int right = 0;
        int left = 0;
        for (char c : moves.toCharArray()){
            if (c == 'L') left++;
            else right++;
        }
        return Math.abs(right - left);
    }
}
