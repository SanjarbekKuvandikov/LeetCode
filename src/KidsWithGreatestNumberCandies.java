import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int greater = Integer.MIN_VALUE;
        for (int candy : candies){
            if (candy > greater){
                greater = candy;
            }
        }
        for (int candy : candies){
            if ((candy + extraCandies) >= greater){
                result.add(true);
            }else result.add(false);
        }

        return result;
    }
}
