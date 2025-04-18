import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        List<Character> firstRow = List.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
        List<Character> secondRow = List.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
        List<Character> thirdRow = List.of('z', 'x', 'c', 'v', 'b', 'n', 'm' );
        List<String> result = new ArrayList<>();

        for (String word : words) {
            int firstCount = 0;
            int secondCount = 0;
            int thirdCount = 0;

            String newWord = word.toLowerCase();

            for (char c : newWord.toCharArray()){
                if (firstRow.contains(c)){
                    firstCount++;
                }else if (secondRow.contains(c)){
                    secondCount++;
                }else if(thirdRow.contains(c)){
                    thirdCount++;
                }
            }
            if (newWord.length() == firstCount || newWord.length() == secondCount || newWord.length() == thirdCount){
                result.add(word);
            }

        }

        return result.toArray(new String[0]);
    }
}