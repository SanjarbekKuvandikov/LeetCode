import java.util.HashSet;
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        int index = 0;
        while (index < nums.length){
            if (hash.contains(nums[index])){
                return true;
            }else {
                hash.add(nums[index]);
            }
            index++;
        }
        return false;
    }
}
