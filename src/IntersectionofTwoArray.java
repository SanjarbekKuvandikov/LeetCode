import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofTwoArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int j : nums1) {
            list1.add(j);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++){
            if (list1.contains(nums2[i])){
                if (!result.contains(nums2[i])){
                    result.add(nums2[i]);
                }
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++){
            res[i] = result.get(i);
        }
        Arrays.sort(res);

        return res;
    }
}
