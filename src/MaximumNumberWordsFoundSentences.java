public class MaximumNumberWordsFoundSentences {
    public int mostWordsFound(String[] sentences) {
        int maxNumberOfWords = 0;
        for (String word : sentences){
            int count = 1;
            for (char c : word.toCharArray()){
                if (c == ' '){
                    count++;
                }
            }
            maxNumberOfWords = Math.max(maxNumberOfWords,count);
        }
        return maxNumberOfWords;
    }
}
