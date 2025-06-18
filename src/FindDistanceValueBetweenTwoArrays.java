public class FindDistanceValueBetweenTwoArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int arr : arr1){
            if (know(arr,arr2,d)) count++;
        }

        return count;
    }
    private boolean know (int arr1, int[] arr2, int d){
        for (int arr : arr2){
            if (Math.abs(arr1 - arr) <= d) return false;
        }
        return true;
    }
}
