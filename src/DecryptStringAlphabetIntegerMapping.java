
public class DecryptStringAlphabetIntegerMapping {
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) == '#' ){
                int num = Integer.parseInt(s.substring(i - 2, i));
                result.append((char)(num + 96));
                i -= 2;
            }else {
                int num = s.charAt(i) - '0';
                result.append((char)(num + 96));
            }
        }
        return result.reverse().toString();
    }
}
