import java.util.ArrayList;
import java.util.List;

public class MinMaxGame {
    public int minMaxGame(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums){
            list.add(num);
        }
        while (list.size() > 1){
            list = cycle(list);
        }

        return list.get(0);
    }
    private List<Integer> cycle(List<Integer> list){
        List<Integer> res =  new ArrayList<>();
        int j = 1;
        for (int i = 1; i < list.size(); i += 2){
            if (j % 2 == 1) res.add(Math.min(list.get(i - 1),list.get(i)));
            else res.add(Math.max(list.get(i - 1),list.get(i)));
            j++;
        }
        return res;
    }
}
