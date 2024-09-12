public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int firt = 0;
        int second =0;
        int count =0;
        boolean ifcan = false;

        while (firt<s.length() && second<t.length()){
            if (s.charAt(firt) == t.charAt(second)){
                count++;
                firt++;
            }
            second++;
        }
        if (count == s.length()){
            ifcan = true;
        }
        return ifcan;
    }
}
