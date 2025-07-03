import java.util.*;

public class MergeSimilarItems {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int[] item : items1){
            map.put(item[0],map.getOrDefault(item[0], 0) + item[1]);
        }

        for (int[] item : items2){
            map.put(item[0],map.getOrDefault(item[0], 0) + item[1]);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            result.add(List.of(entry.getKey(),entry.getValue()));
        }
        result.sort(Comparator.comparingInt(list -> list.get(0)));

        return result;
    }
}
