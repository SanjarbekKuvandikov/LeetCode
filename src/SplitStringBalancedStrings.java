public class SplitStringBalancedStrings {
    public int balancedStringSplit(String s) {
        int count = 0;
        int countL = 0;
        int countR = 0;
        for (char c : s.toCharArray()){
            if (c == 'L') countL++;
            if (c == 'R') countR++;
            if (countL == countR) count++;
        }
        return count;
    }
}
