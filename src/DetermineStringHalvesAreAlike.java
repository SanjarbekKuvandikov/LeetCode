import java.util.List;

public class DetermineStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        List<Character> vowel = List.of('a', 'e', 'i', 'o', 'u');

        int n = s.length() / 2;
        String lowerCase = s.toLowerCase();

        String a = lowerCase.substring(0,n);
        String b= lowerCase.substring(n);

        int countA = 0;
        int countB = 0;

        for (int i = 0; i < a.length(); i++){
            if (vowel.contains(a.charAt(i))) countA++;
            if (vowel.contains(b.charAt(i))) countB++;
        }

        return countA == countB;
    }
}
