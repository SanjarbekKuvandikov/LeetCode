public class CountSquareSumTriples {
    public int countTriples(int n) {
        int count = 0;

        for (int v = 1; v <= n; v++) {
            for (int u = v + 1; u <= n; u++) {
                long sum = (long) u * u + (long) v * v;
                int c = (int) Math.sqrt(sum);
                if ((long) c * c == sum && c <= n) {
                    count += 2;
                }
            }
        }

        return count;
    }
}
