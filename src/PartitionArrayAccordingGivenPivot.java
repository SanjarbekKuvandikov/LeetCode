
public class PartitionArrayAccordingGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];

        int first = 0;
        for (int num : nums){
            if (num < pivot){
                result[first] = num;
                first++;
            }
        }
        for (int num : nums){
            if (num == pivot){
                result[first] = num;
                first++;
            }
        }
        for (int num : nums){
            if (num > pivot){
                result[first] = num;
                first++;
            }
        }
        return result;
    }
}
