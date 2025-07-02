public class CountPrefixesGivenString {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String word : words){
            if (checker(word,s)){
                count++;
            }
        }

        return count;
    }
    private boolean checker(String word, String s){
        int n = word.length();
        if (n < s.length()){
            String newS = s.substring(0,n);
            return newS.equals(word);
        }else if (n == s.length()){
            return s.equals(word);
        }

        return false;
    }
}