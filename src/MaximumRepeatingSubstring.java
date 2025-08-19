

public class MaximumRepeatingSubstring {
    public int maxRepeating(String sequence, String word) {
      int max = 0;
      String repeat = word;

      while (sequence.contains(repeat)){
          max++;
          repeat += word;
      }
      return max;
    }
}