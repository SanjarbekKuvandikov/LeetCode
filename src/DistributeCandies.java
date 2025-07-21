import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        int countCandy = candyType.length;
        Set<Integer> type = new HashSet<>();
        for (int candy : candyType){
            type.add(candy);
        }
        return Math.min(type.size(),countCandy / 2);
    }
}
