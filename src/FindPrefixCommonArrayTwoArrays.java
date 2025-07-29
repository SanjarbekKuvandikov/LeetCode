import java.util.HashSet;
import java.util.Set;

public class FindPrefixCommonArrayTwoArrays {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        int[] result = new int[n];

        for (int i = 0; i < n; i++){
            setA.add(A[i]);
            setB.add(B[i]);
            result[i] = checker(setA,setB);
        }

        return result;
    }
    private int checker(Set<Integer> a, Set<Integer> b){
        int count = 0;
        for (int num : a){
            if (b.contains(num)) count++;
        }
        return count;
    }
}
