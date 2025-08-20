import java.util.ArrayList;
import java.util.List;

public class Combination {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        combineUtil(result, current, n, 1, k);
        return result;
    }

    private static void combineUtil(List<List<Integer>> res,
                                    List<Integer> temp,
                                    int n, int start, int k) {
        if (k == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i <= n; ++i) {
            temp.add(i);
            combineUtil(res, temp, n, i + 1, k - 1);
            temp.remove(temp.size() - 1);
        }
    }
}
