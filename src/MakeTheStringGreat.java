import java.util.Stack;

public class MakeTheStringGreat {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            char a;
            if (c < 'a') {
                a = (char) (c + 32);

            } else {
                a = (char) (c - 32);
            }
            if (!stack.isEmpty() && a == stack.peek()){
                stack.pop();
            }else {
                stack.push(c);
            }
        }

        StringBuilder str = new StringBuilder();
        for (char c : stack){
            str.append(c);
        }
        return str.toString();
    }
}
