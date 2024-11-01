import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowels {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        StringBuilder sb = new StringBuilder(s);
        while (left < right){
            if (vowels.contains(sb.charAt(left))) {
                if (vowels.contains(sb.charAt(right))) {
                    char smth = sb.charAt(left);
                    sb.setCharAt(left, sb.charAt(right));
                    sb.setCharAt(right, smth);

                    left++;
                }
                right--;
            } else {
                left++;
            }
        }
        return sb.toString();
    }
}
//a, e, i, o, u