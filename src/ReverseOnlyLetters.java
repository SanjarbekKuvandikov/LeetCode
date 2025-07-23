
public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        return replacer(s);
    }
    private String replacer(String str){
        char[] chars = str.toCharArray();
        int first = 0;
        int last = str.length() -1;
        while (first < last){
            if (!Character.isAlphabetic(chars[first])){
                first++;
            }
            else if (!Character.isAlphabetic(chars[last])){
             last--;
            }
            else {
                char c = str.charAt(first);
                chars[first] = chars[last];
                chars[last] = c;
                first++;
                last--;
            }
        }
        return new String(chars);
    }
}
