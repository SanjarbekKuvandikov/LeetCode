import java.util.*;

public class MinimumDeletionsAtMostDistinctCharacters {
    public int minDeletion(String s, int k) {
        Hashtable<Character,Integer> hash = new Hashtable<>();
        for (char c : s.toCharArray()){
            hash.put(c,hash.getOrDefault(c,0)+1);
        }
        if (hash.size() == k){
            return 0;
        }
        List<Integer> list = new ArrayList<>();

        for (Map.Entry<Character,Integer> entry : hash.entrySet()){
            list.add(entry.getValue());
        }

        list.sort(Comparator.reverseOrder());

        int min_remove = 0;
        int count = 0;
        for (Integer integer : list) {
            if (count >= k) {
                min_remove += integer;
            }
            count++;
        }

        return min_remove;
    }
}
