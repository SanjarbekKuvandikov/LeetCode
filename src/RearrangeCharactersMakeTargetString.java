import java.util.Hashtable;
import java.util.Map;

public class RearrangeCharactersMakeTargetString {
    public int rearrangeCharacters(String s, String target) {
        Hashtable<Character,Integer> hashS = new Hashtable<>();
        Hashtable<Character,Integer> hashT = new Hashtable<>();

        for (char c : s.toCharArray()){
            hashS.put(c,hashS.getOrDefault(c,0) + 1);
        }
        for (char c : target.toCharArray()){
            hashT.put(c,hashT.getOrDefault(c,0) + 1);
        }
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Character,Integer> entry : hashT.entrySet()){
            int value = hashS.getOrDefault(entry.getKey(),0);
            int max = entry.getValue();
            min = Math.min(min,value / max);
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
