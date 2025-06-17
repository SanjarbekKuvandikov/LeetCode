
public class IncreasingDecreasingString {
    public String sortString(String s) {
        StringBuilder str = new StringBuilder();

        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        while (stillHasCharacters(freq)) {
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    str.append((char) (i + 'a'));
                    freq[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    str.append((char) (i + 'a'));
                    freq[i]--;
                }
            }


        }

        return str.toString();
    }
    private boolean stillHasCharacters(int[] freq) {
        for (int count : freq) {
            if (count > 0) return true;
        }
        return false;
    }

}
