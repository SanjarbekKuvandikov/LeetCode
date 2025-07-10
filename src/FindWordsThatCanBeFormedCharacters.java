import java.util.*;

public class FindWordsThatCanBeFormedCharacters {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        HashMap<Character,Integer> hash = new HashMap<>();
        for (char c : chars.toCharArray()){
            hash.put(c,hash.getOrDefault(c,0) + 1);
        }
        for (String word : words){
            if (checker(word,hash)){
                sum += word.length();
            }
        }
        return sum;
    }
    private boolean checker(String word, HashMap<Character,Integer> hash){
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : word.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            int value = hash.getOrDefault(entry.getKey(),0);
            if (value < entry.getValue()){
                return false;
            }
        }
        return true;
    }
}

