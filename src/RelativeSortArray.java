import java.util.*;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> list =  new ArrayList<>(Arrays.stream(arr2).boxed().toList());
        List<Integer> notContain = new ArrayList<>();
        Map<Integer,Integer> hash = new HashMap<>();
        for (int num : arr1){
            if (list.contains(num)) {
                hash.put(num, hash.getOrDefault(num, 0) + 1);
            }else {notContain.add(num);}
        }
        notContain.sort(Comparator.naturalOrder());
        list.clear();
        int[] result = new int[arr1.length];

        for (int num : arr2) {
            int count = hash.getOrDefault(num, 0);
            for (int i = 0; i < count; i++) {
                list.add(num);
            }
            hash.remove(num);
        }
        int arr_i = 0;
        int list_i = 0;
        int non_i = 0;

        while (arr_i < result.length){
            if (list_i < list.size()) {
                result[arr_i] = list.get(list_i);
                list_i++;
            }else if (non_i < notContain.size()){
                result[arr_i] = notContain.get(non_i);
                non_i++;
            }
            arr_i++;
        }
        return result;
    }
}
