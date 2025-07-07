
import java.util.Arrays;

public class MeanArrarAfterRemovingSomeElements {
    public double trimMean(int[] arr) {
        double deleteMinMax = arr.length * 0.05;
        Arrays.sort(arr);
        int first = 0;
        int last = arr.length - 1;
        while (deleteMinMax > 0){
            arr[first] = -1;
            arr[last] = -1;
            deleteMinMax--;
            first++;
            last--;
        }
        double sum = 0;
        int count = 0;
        for (int num : arr){
            if (num >= 0){
                sum += num;
                count++;
            }
        }

        return sum / count / 100000;
    }
}
