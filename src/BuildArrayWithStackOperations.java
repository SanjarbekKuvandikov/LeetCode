import java.util.ArrayList;
import java.util.List;

public class BuildArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int index = 0;
        for (int i = 1; i <= n; i++){
            if (index == target.length) break;
            list.add("Push");
            if(target[index] != i) list.add("Pop");
            if(target[index] == i) index++;
        }
        return list;
    }
}
