import java.util.ArrayList;
import java.util.List;

public class AddArrayFormInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        String kStr = String.valueOf(k);
        int i = kStr.length() - 1;
        int j = num.length - 1;
        int curr = 0;

        while (i >= 0 || j >= 0 || curr > 0){
            int x = i >= 0 ? kStr.charAt(i) - '0' : 0;
            int y = j >= 0 ? num[j] : 0;

            int sum = x + y + curr;
            result.add(0,sum % 10);
            curr = sum / 10;

            i--;
            j--;
        }

        return result;
    }
}
