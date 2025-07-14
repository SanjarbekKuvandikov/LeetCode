public class NumberEvenOddBits {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        char[] arr = Integer.toBinaryString(n).toCharArray();
        int index = 0;
        for (int  i = arr.length - 1; i >= 0; i-- , index++){
            if (arr[i] == '1'){
                if (index % 2 == 0) even++;
                else odd++;
            }

        }
        return new int[] {even,odd};
    }
}
