import java.util.List;

public class CountNumberVowelStringsRange {
    public int vowelStrings(String[] words, int left, int right) {
        List<Character> list = List.of('a', 'e', 'i', 'o','u');
        int count = 0;
        for (int i = left; i <= right; i++){
            String word = words[i];
            int n = words[i].length() - 1;
            if (list.contains(word.charAt(0))){
                if (list.contains(word.charAt(n))) count++;
            }
        }

        return count;
    }
}
