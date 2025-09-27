public class NumberBitChangesMakeTwoIntegersEqual {
    public int minChanges(int n, int k) {
        String binN = Integer.toBinaryString(n);
        String binK = Integer.toBinaryString(k);

        int maxLen = Math.max(binN.length(), binK.length());
        binN = String.format("%" + maxLen + "s", binN).replace(' ', '0');
        binK = String.format("%" + maxLen + "s", binK).replace(' ', '0');

        int count = 0;

        for (int i = 0; i < binN.length(); i++) {
            if (binN.charAt(i) == '1' && binK.charAt(i) == '0') count++;
            else if (binN.charAt(i) == '0' && binK.charAt(i) == '1') return -1;
        }

        return count;
    }
}
