import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountLargestGroup {
    public int countLargestGroup(int n) {
        if (n < 10){
            return n;
        }
        List<Integer> list = new ArrayList<>();
        while (n > 0){
            if (n < 10){
                list.add(n);
            }else {
                list.add(sum(n));
            }
            n--;
        }
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int num : list){
            hash.put(num,hash.getOrDefault(num, 0) + 1);
        }
        int maxCouple = Integer.MIN_VALUE;
        for (int value : hash.values()){
            maxCouple = Math.max(maxCouple,value);
        }
        int count = 0;
        for (int value : hash.values()){
            if (value == maxCouple){
                count++;
            }
        }
        return count;

    }
    private int sum(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
