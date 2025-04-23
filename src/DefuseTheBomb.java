public class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        int n = code.length;

        for (int index = 0; index < n; index++) {
            int sum = 0;
            if (k > 0) {
                for (int i = 1; i <= k; i++) {
                    sum += code[(index + i) % n];
                }
            } else if (k < 0) {
                for (int i = 1; i <= -k; i++) {
                    sum += code[(index - i + n) % n];
                }
            }
            result[index] = sum;
        }

        return result;
    }
}
//[12,10,16,13]
