import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class NumberStudentsUnableEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : students){
            queue.add(num);
        }
        for (int num : sandwiches){
            stack.add(num);
        }

        int index = 0;
        int size = 0;
        while (!queue.isEmpty() && size < queue.size()){
            if (Objects.equals(queue.peek(), stack.get(index))){
                queue.poll();
                index++;
                size = 0;
            }else {
                queue.add(queue.poll());
                size++;
            }
        }
        return queue.size();
    }
}
