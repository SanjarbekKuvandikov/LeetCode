import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class RingsandRods {
    public int countPoints(String rings) {
        Hashtable<Integer,String> hash = new Hashtable<>();
        for (int i = 1; i < rings.length(); i += 2){
            char c = rings.charAt(i - 1);
            int n = Integer.parseInt(String.valueOf(rings.charAt(i)));
            hash.put(n,hash.getOrDefault(n,"") + c);
        }
        int count = 0;
        for (Map.Entry<Integer,String> entry : hash.entrySet()){
            if (entry.getValue().length() >= 3){
                if (rgb(entry.getValue())){
                    count++;
                }
            }
        }

        return count;
    }
    private boolean rgb(String string){
        Set<Character> set = new HashSet<>();
        for (char c : string.toCharArray()){
            set.add(c);
        }

        return set.size() == 3;
    }
}
