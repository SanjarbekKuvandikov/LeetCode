public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String palindrome = "";
        String palindromeReverse = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i)<='z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {

                palindrome += s.charAt(i);
            }
        }

        for (int i = palindrome.length() -1; i >= 0 ; i--) {
            palindromeReverse += palindrome.charAt(i);
        }
        return palindrome.equals(palindromeReverse);
    }
}