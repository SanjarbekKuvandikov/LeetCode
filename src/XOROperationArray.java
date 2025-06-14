public class XOROperationArray {
    public int xorOperation(int n, int start) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = start + 2 * i;
        }
        int result = array[0];
        for (int i = 1; i < n; i++){
            result ^= array[i];
        }

        return result;
    }
}
