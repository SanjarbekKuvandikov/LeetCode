public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++){
                str.append(s.charAt(i));
                if (s.charAt(i) == ' ') k--;
                if (k == 0) break;
            }


        return str.toString().trim();
    }
}
