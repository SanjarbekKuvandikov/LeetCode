import java.util.HashSet;
import java.util.Set;

public class RestoreFinishingOrder {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        for (int num : friends) set.add(num);
        int[] result = new int[friends.length];
        int index = 0;
        for (int num : order){
            if (index < result.length && set.contains(num)){
                result[index] = num;
                index++;
            }
        }
        return result;
    }
}
