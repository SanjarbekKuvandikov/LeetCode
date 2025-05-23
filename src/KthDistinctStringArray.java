import java.util.*;

public class KthDistinctStringArray {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String,Integer> hash = new LinkedHashMap<>();

        for (String word : arr){
            hash.put(word,hash.getOrDefault(word,0)+1);
        }

        List<String> list = new ArrayList<>();

        for (Map.Entry<String,Integer> entry : hash.entrySet()){
            if (entry.getValue() == 1){
                list.add(entry.getKey());
            }
        }

        if (list.size() >= k){
            return list.get(k-1);
        }

        return "";
    }
}
