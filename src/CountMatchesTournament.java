public class CountMatchesTournament {
    public int numberOfMatches(int n) {
       int totalMatches = 0;
       while (n > 1){
           int matches = n /2;
           totalMatches += matches;
           n = matches + (n % 2);
       }
        return totalMatches;
    }
}
