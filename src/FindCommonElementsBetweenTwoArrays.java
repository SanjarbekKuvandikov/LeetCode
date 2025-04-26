import java.util.Arrays;
import java.util.List;

public class FindCommonElementsBetweenTwoArrays {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int [] answer = new int[2];
        int answerOne = 0;
        int answerTwo = 0;
        List<Integer> listOne = Arrays.stream(nums1).boxed().toList();
        List<Integer> listTwo = Arrays.stream(nums2).boxed().toList();

        for (int j : nums1) {
            if (listTwo.contains(j)) {
                answerOne++;
            }
        }

        for (int j : nums2) {
            if (listOne.contains(j)) {
                answerTwo++;
            }
        }



        answer[0] = (answerOne);
        answer[1] = (answerTwo);
        return answer;
    }
}
