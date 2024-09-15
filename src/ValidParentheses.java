import java.util.LinkedList;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) =='{'){
                stack.push(s.charAt(i));
            }
            else {
                if (stack.isEmpty()) return false;
                char current = s.charAt(i);
                char top = stack.pop();
                if (current == ')' && top != '(') {
                    return false;
                } else if (current == '}' && top != '{') {
                    return false;
                } else if (current == ']' && top != '[') {
                    return false;
                }
            }
        }


        return stack.isEmpty();
    }
}
