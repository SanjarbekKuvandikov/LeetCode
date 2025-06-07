import java.util.*;

public class TwoOutThree {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();

        for (int num : nums1){
            if (set.add(num)) map.put(num,map.getOrDefault(num, 0) + 1);
        }
        set.clear();
        for (int num : nums2){
            if (set.add(num)) map.put(num,map.getOrDefault(num, 0) + 1);
        }
        set.clear();
        for (int num : nums3){
            if (set.add(num)) map.put(num,map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer,Integer> two : map.entrySet()){
            if (two.getValue() >= 2) list.add(two.getKey());
        }
        return list;
    }
}
