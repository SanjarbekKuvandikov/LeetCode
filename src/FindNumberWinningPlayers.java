import java.util.HashMap;
import java.util.Map;


public class FindNumberWinningPlayers {
    public int winningPlayerCount(int n, int[][] pick) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            HashMap<Integer,Integer> hashMap = contains(i,pick);
            int max = 0;
            for (int val : hashMap.values()) {
                max = Math.max(max, val);
            }

            map.put(i, max);
        }
        int count = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getKey() + 1 == entry.getValue()) count++;
        }
        return count;
    }
    private HashMap<Integer, Integer> contains(int index, int[][] pick){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int[] ints : pick){
            if (ints[0] == index){
                hashMap.put(ints[1],hashMap.getOrDefault(ints[1],0) + 1);
            }
        }
        return hashMap;
    }
}
