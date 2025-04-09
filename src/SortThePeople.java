
import java.util.*;

public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        List<Integer> sorting = new ArrayList<>();
        Hashtable<Integer,String> hash = new Hashtable<>();

        for (int i = 0; i < heights.length; i++) {
            sorting.add(heights[i]);
            hash.put(heights[i],names[i]);
        }

        sorting.sort(Comparator.reverseOrder());
        String[] result = new String[names.length];

        for (int i = 0; i < sorting.size(); i++) {
            result[i] = hash.get(sorting.get(i));
        }

        return result;
    }
}
