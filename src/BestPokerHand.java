import java.util.Hashtable;
import java.util.Map;

public class BestPokerHand {
    public String bestHand(int[] ranks, char[] suits) {
        if (checkSuits(suits)) return "Flush";

        int count = checkRanks(ranks);

        if (count >= 3) return "Three of a Kind";
        else if (count == 2) return "Pair";

        return "High Card";
    }
    private boolean checkSuits(char[] suits){
        char a = suits[0];
        for (char c : suits){
            if (a != c) return false;
        }
        return true;
    }
    private int checkRanks(int[] ranks){
        Hashtable<Integer,Integer> hash = new Hashtable<>();

        for (int rank : ranks){
            hash.put(rank,hash.getOrDefault(rank,0) + 1);
        }

        int max = 0;

        for (Map.Entry<Integer,Integer> entry : hash.entrySet()){
            max = Math.max(max,entry.getValue());
        }

        return max;
    }
}
