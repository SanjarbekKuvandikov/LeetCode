import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    public List<String> commonChars(String[] words) {
        int[][] cnt = new int[words.length][26];
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                int c = words[i].charAt(j) - 'a';
                cnt[i][c]++;
            }
        }


            for (int j = 0; j <cnt[0].length; j++) {
                if (cnt[0][j] > 0){
                    int num = checker(j,cnt);
                        char c = (char) ('a' + j);
                        for (int k = 0; k < num; k++){

                            list.add(String.valueOf(c));
                        }
                }
            }


        return list;
    }
    private int checker(int j, int[][] mat){
        int min = Integer.MAX_VALUE;
        for (int[] ints : mat) {
            min = Math.min(min, ints[j]);
        }
        return min;
    }
}
