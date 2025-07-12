public class ReplaceElementsGreatestElementRightSide {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            arr[i] = checker(i + 1, arr);
        }
        return arr;
    }
    private int checker(int index, int[] arr){
        int max = Integer.MIN_VALUE;
        if (index >= arr.length){
            return -1;
        }
        for (int i = index; i < arr.length; i++){
            max = Math.max(arr[i],max);
        }
        return max;
    }
}
