import java.util.Arrays;

public class MaximumUnitsTruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int max = 0;

        for (int[] boxType : boxTypes) {
            if (boxType[0] < truckSize) {
                max += boxType[0] * boxType[1];
                truckSize -= boxType[0];
            } else {
                max += truckSize * boxType[1];
                truckSize -= truckSize;
            }

            if (truckSize == 0) break;
        }

        return max;
    }
}
