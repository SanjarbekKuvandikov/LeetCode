import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TheKWeakestRowsMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++){
            map.put(i,sum(mat[i]));
        }
        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Comparator.comparingInt(Map.Entry<Integer,Integer> :: getValue).thenComparing(Map.Entry :: getKey));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
            return result;
    }
    private int sum (int[] ints){
        int sum = 0;
        for (int num : ints){
            sum += num;
        }
        return sum;
    }
}
