import java.util.Hashtable;
import java.util.Map;

public class OddStringDifference {
    public String oddString(String[] words) {
        Hashtable<String,String> hash = new Hashtable<>();
        int n = words[0].length();
        for (String word : words){
            StringBuilder sb = new StringBuilder();
            for (int k = 1; k < word.length(); k++) {
                sb.append((word.charAt(k) - word.charAt(k - 1))).append(",");
            }
            String key = sb.toString();
            hash.put(key,hash.getOrDefault(key,"") + word);
        }

        for (Map.Entry<String,String> entry : hash.entrySet()){
            if (entry.getValue().length() == n) return entry.getValue();
        }

        return "";
    }
}
