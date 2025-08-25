public class FindMiddleIndexArray {
    public int findMiddleIndex(int[] nums) {
        int index = 0;
        int middleIndex = -1;
        while (index < nums.length){
            if (front(index,nums) == back(index,nums)){
                middleIndex = index;
            }
            index++;
        }
        return middleIndex;
    }
    private int front(int begin, int[] num){
        int sum = 0;
        for (int i = 0; i < begin; i++){
            sum += num[i];
        }
        return sum;
    }
    private int back(int begin, int[] num){
        int sum = 0;
        for (int i = begin + 1; i < num.length; i++){
            sum += num[i];
        }
        return sum;
    }
}
