

public class MinimumNumberStepsMakeTwoStringsAnagram {
    public int minSteps(String s, String t) {
        int count = 0;
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            freq[c - 'a']--;
        }

        for (int f : freq) {
            if (f > 0) count += f;
        }

        return count;
    }
}
