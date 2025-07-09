import java.util.Stack;
public class RemoveAllAdjacentDuplicatesString {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (!stack.empty() && stack.peek() == s.charAt(i)){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}
