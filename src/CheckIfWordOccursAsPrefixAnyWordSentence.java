public class CheckIfWordOccursAsPrefixAnyWordSentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int min = Integer.MAX_VALUE;
        int count = 1;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (Character.isAlphabetic(c)){
                str.append(c);
            }
            else {
                if (isExist(str.toString(),searchWord)){
                    min = Math.min(min,count);
                }
                count++;
                str.setLength(0);
            }
        }
        if (isExist(str.toString(),searchWord)){
            min = Math.min(min,count);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
    private boolean isExist(String str, String search){
        if (search.length() > str.length()) return false;

        for (int i = 0; i < search.length(); i++) {
            if (search.charAt(i) != str.charAt(i)) return false;
        }

        return true;
    }
}
