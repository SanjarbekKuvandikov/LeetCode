public class FindFirstPalindromicStringArray {
    public String firstPalindrome(String[] words) {
        StringBuilder str = new StringBuilder();
        for (String word : words){
            str = new StringBuilder(word);
            str.reverse();

            if (word.contentEquals(str)){
                return word;
            }
        }
        return "";
    }
}
