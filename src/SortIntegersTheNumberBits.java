import java.util.*;

public class SortIntegersTheNumberBits {
    public int[] sortByBits(int[] arr) {
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>();

        for (int j : arr) {
            entries.add(new AbstractMap.SimpleEntry<>(j, Integer.bitCount(j)));
        }

        entries.sort(Comparator.comparing(Map.Entry<Integer,Integer> :: getValue)
                .thenComparing(Map.Entry :: getKey));

        int[] result = new int[arr.length];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : entries){
            result[index++] = entry.getKey();
        }

        return result;
    }
}
