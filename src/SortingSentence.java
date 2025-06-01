

public class SortingSentence {
    public String sortSentence(String s) {
        String[] sentence = new String[10];
        StringBuilder str = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()){
            if (Character.isDigit(c)){
                int num = Integer.parseInt(String.valueOf(c));
                sentence[num] = str.toString();
                str.setLength(0);
            }else if (c != ' '){
                str.append(c);
            }
        }
        for (String word : sentence){
            if (word != null) result.append(word + " ");
        }
        return result.toString().trim();
    }
}
