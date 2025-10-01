import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputeDecimalRepresentation {
    public int[] decimalRepresentation(int n) {
        List<Integer> list = new ArrayList<>();
        int ten = 1;

        while (n > 0){
            int num = n % 10 * ten;
            if (num != 0){
                list.add(num);
            }
            n /= 10;
            ten *= 10;
        }
        int[] result = new int[list.size()];
        Collections.sort(list);

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(list.size() - i - 1);
        }

        return result;
    }
}
