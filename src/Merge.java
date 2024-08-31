import java.util.Arrays;

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start filling from the end of nums1
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        // Compare and merge nums1 and nums2 from the end
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are any elements left in nums2, copy them over
        // No need to check for nums1 because it's already in place
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {
        Merge merge = new Merge();
        int[] nums1 = {2,0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        merge.merge(nums1,m,nums2,n);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
        // Output: [1, 2, 2, 3, 5, 6]
    }
}

