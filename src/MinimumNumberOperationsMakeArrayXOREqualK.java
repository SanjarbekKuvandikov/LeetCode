public class MinimumNumberOperationsMakeArrayXOREqualK {
    public int minOperations(int[] nums, int k) {
        int xor_all = nums[0];
        for (int i = 1; i < nums.length; i++){
            xor_all ^= nums[i];
        }
        String kBin = Integer.toBinaryString(k);
        String xorBin = Integer.toBinaryString(xor_all);

        int maxLength = Math.max(kBin.length(), xorBin.length());
        kBin = String.format("%" + maxLength + "s", kBin).replace(' ', '0');
        xorBin = String.format("%" + maxLength + "s", xorBin).replace(' ', '0');

        int count = 0;
        for (int i = 0; i < maxLength; i++) {
            if (kBin.charAt(i) != xorBin.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
