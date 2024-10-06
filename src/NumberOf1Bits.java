public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int sum = Integer.bitCount(n);
        return sum;
    }
}
