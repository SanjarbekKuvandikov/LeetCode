import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class UncommonWordsTwoSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        Hashtable<String,Integer> hash = new Hashtable<>();
        for (char c : s1.toCharArray()){
            if (c == ' '){
                hash.put(str.toString(),hash.getOrDefault(str.toString(),0) + 1);
                str.setLength(0);
            }else {
                str.append(c);
            }
        }
        hash.put(str.toString(),hash.getOrDefault(str.toString(),0) + 1);
        str.setLength(0);

        for (char c : s2.toCharArray()){
            if (c == ' '){
                hash.put(str.toString(),hash.getOrDefault(str.toString(),0) + 1);
                str.setLength(0);
            }else {
                str.append(c);
            }
        }
        hash.put(str.toString(),hash.getOrDefault(str.toString(),0) + 1);
        for (Map.Entry<String,Integer> entry : hash.entrySet()){
            if (entry.getValue() == 1) list.add(entry.getKey());
        }

        String[] result = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
}
