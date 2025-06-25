import java.util.*;

public class CountPairsSimilarStrings {
    public int similarPairs(String[] words) {
        Map<String,Integer> map = new HashMap<>();
        for (String word : words){
            Set<Character> setChar =  new HashSet<>();
            for (char c : word.toCharArray()){
                setChar.add(c);
            }

            List<Character> list = new ArrayList<>(setChar);
            Collections.sort(list);
            StringBuilder str = new StringBuilder();
            for (char c : list.toString().toCharArray()){
                str.append(c);
            }

            map.put(str.toString(),map.getOrDefault(str.toString(),0)+1);
        }
        int count = 0;
        for (int i : map.values()){
            count += i * (i - 1) / 2;
        }

        return count;
    }
}
