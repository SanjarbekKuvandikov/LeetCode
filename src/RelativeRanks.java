import java.util.PriorityQueue;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) ->b[0]-a[0]);

        for (int i = 0; i < n; i++){
            pq.offer(new int[]{score[i],i});
        }

        String [] result = new String[n];

        int rank = 1;
        while (!pq.isEmpty()){
            int [] current = pq.poll();
            int index = current[1];

            if (rank == 1) result[index] = "Gold Medal";
            else if (rank == 2) result[index] = "Silver Medal";
            else if (rank == 3) result[index] = "Bronze Medal";
            else result[index] = String.valueOf(rank);

            rank++;
        }

        return result;
    }
}
// 10,3,8,9,4
// 10,9,8,4,3