public class StrictlyPalindromicNumber {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++){
            if (!isPalindromic(Integer.toString( n, i))){
                return false;
            }
        }
        return true;
    }
    private boolean isPalindromic(String str){
        StringBuilder reverse = new StringBuilder(str);
        return str.contentEquals(reverse.reverse());
    }
}
