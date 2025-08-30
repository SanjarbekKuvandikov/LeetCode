import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MinimumCommonValue {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new TreeSet<>();
        for (int num : nums1){
            set.add(num);
        }

        for (int num : nums2){
            set1.add(num);
        }

        for (int num : set1){
            if (!set.add(num)) return num;
        }

        return -1;
    }
}
