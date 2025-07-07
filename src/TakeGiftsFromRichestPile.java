
import java.util.Comparator;
import java.util.PriorityQueue;

public class TakeGiftsFromRichestPile {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pr = new PriorityQueue<>(Comparator.reverseOrder());

        for (int num : gifts){
            pr.add(num);
        }

        while (k-- > 0) {
            int sq = pr.poll();
            pr.add((int) Math.floor(Math.sqrt(sq)));

        }
        long sum = 0;
        while (!pr.isEmpty()){
            sum += pr.poll();
        }

        return sum;
    }
}
