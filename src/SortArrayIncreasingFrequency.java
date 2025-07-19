import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortArrayIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Map<Integer,Integer> cnt = new HashMap<>();
        for (int num : arr) {
            if (cnt.containsKey(num)) {
                cnt.put(num, cnt.get(num) + 1);
            } else {
                cnt.put(num, 1);
            }
        }

        Arrays.sort(arr, new CustomComparator(cnt));
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }

    static class CustomComparator implements Comparator<Integer> {
        final Map<Integer,Integer> cnt;
        public CustomComparator(Map<Integer,Integer> count){
            cnt = count;
        }
        @Override
        public int compare(Integer o1, Integer o2) {
            int cnt1 = cnt.get(o1);
            int cnt2 = cnt.get(o2);
            if (cnt1 == cnt2){
                return o2 - o1;
            }
            return cnt1 - cnt2;
        }
    }

}
