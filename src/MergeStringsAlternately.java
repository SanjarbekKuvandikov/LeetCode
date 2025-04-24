public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int first = 0;
        int second = 0;
        int firstLength = word1.length();
        int secondLength = word2.length();
        StringBuilder result = new StringBuilder();

        while (first < firstLength || second < secondLength){

            if(first < firstLength){
                result.append(word1.charAt(first));
                first++;
            }
            if (second < secondLength){
                result.append(word2.charAt(second));
                second++;
            }
        }

        return  result.toString();
    }
}
