public class ScoreOfString {
    public int scoreOfString(String s) {
        int score = 0;
            int index = 1;
            while (index < s.length()){
                int one = s.charAt(index-1);
                int two = s.charAt(index);
                score += Math.abs(one - two);
                index++;
            }
        return score;
    }
}
