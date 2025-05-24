public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0;
        int first = 0;
        int second = n;
        while (first < second && second < nums.length){
            result[index] = nums[first];
            index++;
            result[index] = nums[second];
            index++;
            first++;
            second++;
        }
        return result;
    }
}
