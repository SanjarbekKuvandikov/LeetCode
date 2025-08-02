import java.util.ArrayList;
import java.util.List;

public class QueriesPermutationWithKey {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= m; i++){
            list.add(i);
        }
        for (int i = 0; i < queries.length; i++){
            queries[i] = findIndex(queries[i],list);
        }
        return queries;
    }
    private int findIndex(int num,List<Integer> list){
        int index = 0;
        for (int i = 0; i < list.size(); i++){
            if (num == list.get(i)){
                index = i;
                break;
            }
        }
        int three = list.get(index);
        list.remove(index);
        list.add(0,three);

        return index;
    }
}
