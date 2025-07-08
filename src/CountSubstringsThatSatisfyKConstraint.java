public class CountSubstringsThatSatisfyKConstraint {
    public int countKConstraintSubstrings(String s, int k) {
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            for (int j = i + 1; j <= s.length(); j++){
                int[] ints = counter(s.substring(i,j));
                if (ints[0] <= k || ints[1] <= k) count++;
            }
        }
        return count;
    }
    private int[] counter(String word){
        int zero = 0;
        int one = 0;
        for (char c : word.toCharArray()){
            if (c == '0') zero++;
            else one++;
        }

        return new int[]{zero,one};
    }
}
