

import java.util.HashMap;
import java.util.List;

public class NumberEquivalentDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<List<Integer>,Integer> hash = new HashMap<>();
        int count = 0;
        for (int[] dominoe : dominoes){

            int a = dominoe[0];
            int b = dominoe[1];

            List<Integer> list = (a <= b) ? List.of(a, b) : List.of(b, a);

            int even = hash.getOrDefault(list,0);
            count += even;
            hash.put(list,even + 1);
        }

        return count;
    }
}
