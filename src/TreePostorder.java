import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class TreePostorder {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }


    class Solution {
        public List<Integer> postorder(Node root) {
            if (root == null) return new ArrayList<>();

            LinkedList<Integer> result = new LinkedList<>();
            Stack<Node> stack = new Stack<>();

            stack.push(root);

            while (!stack.empty()){
                Node current = stack.pop();
                result.addFirst(current.val);

                for (Node child : current.children){
                    stack.push(child);
                }
            }
            return result;
        }
    }
}
