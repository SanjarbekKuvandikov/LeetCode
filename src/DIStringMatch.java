public class DIStringMatch {
    public int[] diStringMatch(String s) {
        int low = 0;
        int high = s.length();
        int [] perms = new int[high+1];

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'I'){
                perms[i] = low;
                low++;
            }else {
                perms[i] = high;
                high--;
            }
        }

        perms[s.length()] = low;

        return perms;
    }
}
