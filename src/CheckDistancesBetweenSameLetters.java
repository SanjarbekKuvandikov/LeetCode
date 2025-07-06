
import java.util.HashMap;
import java.util.Map;

public class CheckDistancesBetweenSameLetters {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character,Integer> list = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            for (int j = i + 1; j < s.length(); j++){
                if (s.charAt(i) == s.charAt(j)){
                    list.put(s.charAt(i),j - i -1);
                }
            }
        }
        for (Map.Entry<Character,Integer> entry : list.entrySet()){
            if (entry.getValue() != distance[entry.getKey() - 'a']){
                return false;
            }
        }

        return true;
    }
}
