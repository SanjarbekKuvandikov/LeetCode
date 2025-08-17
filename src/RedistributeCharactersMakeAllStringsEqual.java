import java.util.HashMap;
import java.util.Map;

public class RedistributeCharactersMakeAllStringsEqual {
    public boolean makeEqual(String[] words) {
        int length = words.length;
        Map<Character,Integer> map = new HashMap<>();
        for (String word : words){
            for (char c : word.toCharArray()){
                map.put(c,map.getOrDefault(c,0) + 1);
            }
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue() < length || entry.getValue() % length != 0) return false;
        }
        return true;
    }
}
