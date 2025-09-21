public class FindLongestBalancedSubstringBinaryString {
    public int findTheLongestBalancedSubstring(String s) {
        int max = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if (balanced(sub) && checker(sub)) {
                    max = Math.max(max, sub.length());
                }
            }
        }
        return max;
    }
    private boolean checker(String str){
        boolean one = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1'){
                one= true;
            }
            if (str.charAt(i) == '0' && one){
                return false;
            }
        }
        return true;
    }
    private boolean balanced(String str){
        int ones = 0, zeros = 0;
        for (char c : str.toCharArray()){
            if (c == '1') ones++;
            else zeros++;
        }
        return ones == zeros;
    }
}
