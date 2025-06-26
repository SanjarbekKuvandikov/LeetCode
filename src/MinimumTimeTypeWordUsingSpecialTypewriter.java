public class MinimumTimeTypeWordUsingSpecialTypewriter {
    public int minTimeToType(String word) {
        int pointer = 'a';
        int min = 0;

        for (char c : word.toCharArray()){
            int diff = Math.abs(c - pointer);
            int move = Math.min(diff, 26 - diff);
            min += move + 1;
            pointer = c;
        }

        return min;
    }
}
