import java.util.*;

public class ConvertArrayInto2DArrayWithConditions {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for (int num : nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        int i = 1;
        while (true) {
            List<Integer> list1 = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() >= i){
                    list1.add(entry.getKey());
                }
            }
            if (list1.isEmpty()) break;
            i++;
            result.add(list1);
        }

        return result;
    }
}
