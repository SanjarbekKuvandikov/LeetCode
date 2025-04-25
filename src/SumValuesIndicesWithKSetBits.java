import java.util.List;

public class SumValuesIndicesWithKSetBits {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++){
            int count = counter(i);
            if (count == k){
                sum += nums.get(i);
            }
        }

        return sum;
    }
    private int counter(int n){
        int count = 0;
        String binary = Integer.toBinaryString(n);
        for (char a : binary.toCharArray()){
            if (a == '1'){
                count++;
            }
        }
        return count;
    }
}
