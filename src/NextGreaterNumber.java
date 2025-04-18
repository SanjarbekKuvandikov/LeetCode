import java.util.Hashtable;
import java.util.Stack;

public class NextGreaterNumber {
    public int [] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Hashtable<Integer,Integer> hash = new Hashtable<>();
       for (int i = nums2.length-1; i >= 0; i--){
           while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
               stack.pop();
           }
           if (stack.isEmpty()) {
               hash.put(nums2[i], -1);
           } else {
               hash.put(nums2[i], stack.peek());
           }
           stack.push(nums2[i]);
       }
       int [] result = new int[nums1.length];
       for (int i = 0; i < nums1.length; i++){
           result[i] = hash.get(nums1[i]);
       }
        return result;
    }
}
