public class FindKCharacterStringGame {
    public char kthCharacter(int k) {
        String word = "a";

        while (word.length() <= k){
            word = doing(word);
        }

        return word.charAt(k-1);
    }
    private String doing(String word){
        StringBuilder string =  new StringBuilder();
        for (int i = 0; i < word.length(); i++){

            char c = word.charAt(i);

            if (c == 'z'){
                string.append('a');
            }else {
                string.append((char)(c+1));
            }
        }

        return word + string;
    }
}
