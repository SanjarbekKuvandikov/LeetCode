import java.util.Stack;

public class ClearDigits {
    public String clearDigits(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char word = s.charAt(i);
            if (Character.isDigit(word)){
                while (!stack.isEmpty()) {
                    char top = stack.pop();
                    if (!Character.isDigit(top)) break;
                }
            }else {
                stack.push(word);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c: stack){
            result.append(c);
        }

        return result.toString();
    }
}
