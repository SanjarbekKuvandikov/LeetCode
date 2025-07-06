import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinimumSumFourDigitNumberAfterSplittingDigits {
    public int minimumSum(int num) {
        List<Integer> list = new ArrayList<>();
        while (num > 0){
            list.add(num % 10);
            num /= 10;
        }
        list.sort(Comparator.naturalOrder());
        int sum = 0;
        int begin = 0;
        int last = list.size() - 1;
        while (begin < last){
            sum += list.get(begin) * 10 + list.get(last);
            begin++;
            last--;
        }

        return sum;
    }
}
