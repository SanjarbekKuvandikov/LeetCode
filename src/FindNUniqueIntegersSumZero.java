public class FindNUniqueIntegersSumZero {
    public int[] sumZero(int n) {
        int[] arr = new int[n];

        int minus = -1;
        int plus = 1;
        int mid = n / 2;
        int first, last;

        if (n % 2 == 1){
            first = mid - 1;
            last = mid + 1;
            arr[mid] = 0;
            while (first >= 0 && last < n) {
                arr[first] = minus--;
                arr[last] = plus++;
                first--;
                last++;
            }
        }else {
            first = mid - 1;
            last = mid;
            while (first >= 0 && last < n) {
                arr[first] = minus--;
                arr[last] = plus++;
                first--;
                last++;
            }
        }

        return arr;
    }
}

