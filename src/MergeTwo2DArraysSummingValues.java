import java.util.Map;
import java.util.TreeMap;

public class MergeTwo2DArraysSummingValues {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer> hash = new TreeMap<>();
        for (int[] ints : nums1) {
            hash.put(ints[0], hash.getOrDefault(ints[0], 0) + ints[1]);
        }
        for (int[] ints : nums2) {
            hash.put(ints[0], hash.getOrDefault(ints[0], 0) + ints[1]);
        }
        int[][] result = new int[hash.size()][2];
        int index = 0;
        for (Map.Entry<Integer,Integer> entry : hash.entrySet()){
            result[index][0] = entry.getKey();
            result[index][1] = entry.getValue();
            index++;
        }

        return result;
    }
}
