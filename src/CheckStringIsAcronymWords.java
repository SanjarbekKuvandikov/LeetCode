import java.util.List;

public class CheckStringIsAcronymWords {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder str = new StringBuilder();

        for (String string: words){
            str.append(string.charAt(0));
        }

        return str.toString().equals(s);
    }
}
