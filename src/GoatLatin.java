import java.util.List;

public class GoatLatin {
    public String toGoatLatin(String sentence) {
        int count = 1;
        StringBuilder str = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (char c : sentence.toCharArray()){
            if (c == ' '){
                result.append(add(str,count++));
                result.append(' ');
                str.setLength(0);
            }else {
                str.append(c);
            }
        }
        result.append(add(str,count));
        return result.toString();
    }
    private String add(StringBuilder str,int i){
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        char firstChar = str.charAt(0);
        StringBuilder word = new StringBuilder();
        if (vowels.contains(Character.toLowerCase(firstChar))) {
            word.append(str);
        } else {
            word.append(str.substring(1)).append(firstChar);
        }

        word.append("ma");
        word.append("a".repeat(i));
        return word.toString();
    }
}
