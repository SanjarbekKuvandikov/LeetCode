import java.util.HashSet;

public class FindMaximumNumberStringPairs {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();

        for (String word : words){

            StringBuilder str = new StringBuilder(word);
            str.reverse();

            if (!set.contains(str.toString())){
                set.add(word);
            }

        }

        return words.length - set.size();
    }
}
