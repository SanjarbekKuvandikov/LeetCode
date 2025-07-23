import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal) && hasDuplicates(s)) return true;
        List<Integer> list = counter(s,goal);
        if (list.size() != 2) return false;
        int i = list.get(0), j = list.get(1);
        return s.charAt(i) == goal.charAt(j) && s.charAt(j) == goal.charAt(i);
    }
    private List<Integer> counter(String s, String goal){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != goal.charAt(i)) {
                list.add(i);
            }
        }
        return list;
    }
    private boolean hasDuplicates(String s){
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()){
            if (!set.add(c)) return true;
        }
        return false;
    }
}
