import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            {
                boolean check = checker(words[i], x);
                if (check) {
                    list.add(i);
                }
            }
        }

        return list;
    }
    private boolean checker(String word , char x){
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == x){
                return true;
            }
        }
        return false;
    }
}
