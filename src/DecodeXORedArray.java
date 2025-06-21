public class DecodeXORedArray {
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        int index = 1;

        for (int i = 0; i < encoded.length; i++){
            arr[index] = arr[i] ^ encoded[i];
            index++;
        }

        return arr;
    }
}
