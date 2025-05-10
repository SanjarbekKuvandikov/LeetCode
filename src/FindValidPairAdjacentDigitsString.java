import java.util.HashMap;

public class FindValidPairAdjacentDigitsString {
    public String findValidPair(String s) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (char c : s.toCharArray()) {
            int num = Integer.parseInt(String.valueOf(c));
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i < s.length(); i++){

            if (s.charAt(i-1) != s.charAt(i)){
                int a = s.charAt(i - 1) - '0';
                int b = s.charAt(i) - '0';

                if (hash.get(a) == a && hash.get(b) == b) {
                    return "" + s.charAt(i - 1) + s.charAt(i);
                }


            }
        }

        return "";
    }
}
