import java.util.HashMap;
import java.util.Map;

public class MajorityFrequencyCharacters {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character,Integer> hash = new HashMap<>();
        for (char c : s.toCharArray()){
            hash.put(c,hash.getOrDefault(c,0) + 1);
        }
        HashMap<Integer,String> map = new HashMap<>();
        for (Map.Entry<Character,Integer> entry : hash.entrySet()){
            map.put(entry.getValue(),map.getOrDefault(entry.getValue(),"") + entry.getKey());
        }
        StringBuilder str = new StringBuilder();
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            if (entry.getValue().length() > str.length()){
                str.setLength(0);
                str.append(entry.getValue());
            }
            else if (entry.getValue().length() == str.length()){
                int ints = getKeyByValue(map,str.toString());
                if (entry.getKey() > ints){
                    str.setLength(0);
                    str.append(entry.getValue());
                }
            }
        }
        return str.toString();
    }
    public static int getKeyByValue(HashMap<Integer, String> map, String value) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
