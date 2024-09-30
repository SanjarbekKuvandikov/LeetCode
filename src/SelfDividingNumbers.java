import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i=left; i<=right; i++){
            if (isSelfDividing(i)){
                result.add(i);
            }
        }
        return result;
    }
    private static boolean isSelfDividing(int num) {
        int original = num;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0 || original % digit != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
