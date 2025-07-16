public class RemovePalindromicSubsequences {
    public int removePalindromeSub(String s) {
        if (isPalindrome(s)) return 1;
        else return 2;
    }
    private boolean isPalindrome(String str){
        int n = str.length();
        for (int i = 0; i < n / 2; i++){
            if (str.charAt(i) != str.charAt(n - i - 1)) return false;
        }
        return true;
    }
}
