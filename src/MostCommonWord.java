
import java.util.*;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Hashtable<String,Integer> hash = new Hashtable<>();
        StringBuilder str = new StringBuilder();

        for (char c : paragraph.toCharArray()) {
            if (Character.isAlphabetic(c)){
                str.append(c);
            }
            else if (!str.isEmpty()){
                String s = str.toString().toLowerCase();
                hash.put(s,hash.getOrDefault(s,0) + 1);
                str.setLength(0);
            }
        }

        if (!str.isEmpty()){
            String s = str.toString().toLowerCase();
            hash.put(s,hash.getOrDefault(s,0) + 1);
        }

        List<String> ban = new ArrayList<>();
        Collections.addAll(ban, banned);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(hash.entrySet());

        list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        for (Map.Entry<String,Integer> entry : list){
            if (!ban.contains(entry.getKey())) return entry.getKey();
        }
        return "";
    }
}
