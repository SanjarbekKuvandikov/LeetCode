import java.util.ArrayList;
import java.util.List;

public class OccurrencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        for (char c : text.toCharArray()){
            if (Character.isAlphabetic(c)){
                str.append(c);
            }else if (!str.isEmpty()){
                list.add(str.toString());
                str.setLength(0);
            }
        }
        if (!str.isEmpty()){
            list.add(str.toString());
        }

        List<String> result = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).equals(first) && list.get(i).equals(second)){
                if (i + 1 < list.size()) result.add(list.get(i + 1));
            }
        }
        return result.toArray(new String[0]);
    }
}
