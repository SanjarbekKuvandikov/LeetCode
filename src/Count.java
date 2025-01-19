import java.util.HashSet;

public class Count {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        HashSet<Character> upper = new HashSet<>();
        HashSet<Character> lower = new HashSet<>();
        for (int i = 0; i < word.length(); i++){
            if (!lower.contains(word.charAt(i)) && word.charAt(i) >= 'a' && word.charAt(i) <= 'z'){
                lower.add(word.charAt(i));
            }else if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
                upper.add(word.charAt(i));
            }
        }
        String low = lower.toString();
        for (int i = 0; i < low.length(); i++){
            char ch = low.charAt(i);
            char chars = Character.toUpperCase(ch);
            boolean hasVowels = upper.contains(chars);
            if (hasVowels){
                count++;
            }
        }
        return count;
    }
}
