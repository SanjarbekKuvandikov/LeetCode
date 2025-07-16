import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));
        int index = 0;
        for (int i = 1; i < numRows; i++){
            result.add(create(i,result.get(index++)));
        }
        return result;
    }
    private List<Integer> create(int n,List<Integer> list){
        List<Integer> result = new ArrayList<>();
        if (n >= 2) {
            result.add(1);
            for (int i = 1; i < list.size(); i++) {
                result.add(list.get(i - 1) + list.get(i));
            }
            result.add(1);
        }
        else {
            return List.of(1,1);
        }
        return result;
    }
}
