import java.util.ArrayList;
import java.util.List;

public class SplitStringsSeparator {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();


        for (String word : words){
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < word.length(); i++){
                if (separator != word.charAt(i)){
                    str.append(word.charAt(i));
                }else {
                    if (!str.isEmpty()){
                        result.add(str.toString());
                    str.setLength(0);
                }
                }
            }

            if (!str.isEmpty()){
                result.add(str.toString());
            }

        }


        return result;
    }
}
