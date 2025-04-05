import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String operation : operations) {

            switch (operation) {
                case "C" -> stack.pop();
                case "D" -> stack.push(stack.peek() * 2);
                case "+" -> {
                        int last = stack.pop();
                        int second = stack.peek();
                        stack.push(last);
                        stack.push(last+second);
                }
                default -> {
                    int number = Integer.parseInt(operation);
                    stack.add(number);
                }
            }
        }
        int sum = 0;
        for (int score : stack){
            sum += score;
        }
        return sum;
    }
}
