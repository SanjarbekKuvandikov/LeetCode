

public class CircularSentence {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 1; i < words.length; i++){
            char first = words[i - 1].charAt(words[i - 1].length() - 1);
            char second = words[i].charAt(0);
            if (first != second){
                return false;
            }
        }

        char first = words[0].charAt(0);
        char second = words[words.length - 1].charAt(words[words.length - 1].length() - 1);
        return first == second;
    }
}
