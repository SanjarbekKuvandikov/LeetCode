public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            if (first(i,nums) == last(i,nums)) return i;
        }
        return -1;
    }
    private int first(int index, int[] num){
        int sum = 0;
        for (int i = 0; i < index; i++){
            sum += num[i];
        }
        return sum;
    }
    private int last(int index, int[] num){
        int sum = 0;
        for (int i = index + 1; i < num.length; i++){
            sum += num[i];
        }
        return sum;
    }
}
