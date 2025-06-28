import java.util.ArrayList;
import java.util.List;

public class MaximumNumberWordsYouCanType {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        List<Character> list = new ArrayList<>();
        for (char c : text.toCharArray()){
            if (c == ' '){
                if (isContain(list, brokenLetters)) count++;
                list.clear();
            }else {
                list.add(c);
            }
        }

        if (isContain(list, brokenLetters)) count++;
        return count;
    }
    private boolean isContain(List<Character> list, String str){
        for (char c : str.toCharArray()){
            if (list.contains(c)) return false;
        }
        return true;
    }
}
