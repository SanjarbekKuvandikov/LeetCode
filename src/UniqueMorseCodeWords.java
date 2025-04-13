import java.util.HashMap;
import java.util.Set;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<String,Integer> hash = new HashMap<>();
        StringBuilder all = new StringBuilder();
        for (int i = 0; i < words.length; i++){
            String s = words[i];
            for (int j = 0; j < s.length(); j++){
                String morse = converter(s.charAt(j));
                all.append(morse);
            }
            hash.put(all.toString(), i);
            all.setLength(0);
        }
        Set<String> set = hash.keySet();
        return set.size();
    }

    private String converter(char chars){
        switch (chars){
            case 'a' -> {
                return ".-";
            }
            case 'b' -> {
                return "-...";
            }
            case 'c' -> {
                return "-.-.";
            }
            case 'd' -> {
                return "-..";
            }
            case 'e' -> {
               return  ".";
            }
            case 'f' -> {
               return  "..-.";
            }
            case 'g' -> {
                return "--.";
            }
            case 'h' -> {
                return "....";
            }
            case 'i' -> {
                return "..";
            }
            case 'j' -> {
                return ".---";
            }
            case 'k' -> {
               return  "-.-";
            }
            case 'l' -> {
                return ".-..";
            }
            case 'm' -> {
                return "--";
            }
            case 'n' -> {
                return "-.";
            }
            case 'o' -> {
                return "---";
            }
            case 'p' -> {
                return ".--.";
            }
            case 'q' -> {
                return "--.-";
            }
            case 'r' -> {
                return ".-.";
            }
            case 's' -> {
                return "...";
            }
            case 't' -> {
                return "-";
            }
            case 'u' -> {
                return "..-";
            }
            case 'v' -> {
                return "...-";
            }
            case 'w' -> {
                return ".--";
            }
            case 'x' -> {
                return "-..-";
            }
            case 'y' -> {
                return "-.--";
            }
            case 'z' -> {
                return "--..";
            }
        }
        return "";
    }
}
