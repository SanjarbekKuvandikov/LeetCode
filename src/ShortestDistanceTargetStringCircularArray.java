public class ShortestDistanceTargetStringCircularArray {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        boolean find = false;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)){
                find = true;
                int front = Math.abs(i - startIndex);
                int back = n - front;
                min = Math.min(min,Math.min(front,back));
            }
        }
        return find ? min : -1;
    }
}
