public class ValidPalindromeTwo {
    public boolean validPalindrome(String s) {
        int first = 0;
        int last = s.length() - 1;

        while (first < last) {
            if (s.charAt(first) != s.charAt(last)) {
                return isPalindrome(s, first + 1, last) || isPalindrome(s, first, last - 1);
            }
            first++;
            last--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int first, int last) {
        while (first < last) {
            if (s.charAt(first) != s.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
