
import java.util.HashSet;

public class FindMissingRepeatedValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int doubleNumber = 0;
        int inAll = 0;
        int inArray = 0;

        HashSet<Integer> set = new HashSet<>();

        int length = grid.length * grid.length;
        for (int i = 1; i <= length; i++){
            inAll += i;
        }

        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (!set.add(anInt)) {
                    doubleNumber = anInt;
                }
                inArray += anInt;
            }
        }

        int [] result = new int[2];
        result[0] = doubleNumber;
        result[1] = Math.abs((inAll - inArray) + doubleNumber);

        return result;
    }
}
