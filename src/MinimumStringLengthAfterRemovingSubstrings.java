import java.util.Stack;

public class MinimumStringLengthAfterRemovingSubstrings {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if (!stack.empty()){
                char top = stack.peek();
                if ((top == 'A' && c == 'B') || (top == 'C' && c == 'D')) {
                    stack.pop();
                    continue;
                }
            }

            stack.push(c);
        }

      return stack.size();
    }
}
