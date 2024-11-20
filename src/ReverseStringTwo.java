public class ReverseStringTwo {
    public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2 * k) {
            StringBuilder part1 = new StringBuilder(s.substring(i, Math.min(i + k, s.length())));
            part1.reverse();
            result.append(part1);

            if (i + k < s.length()) {
                result.append(s, i + k, Math.min(i + 2 * k, s.length()));
            }
        }
        return result.toString();
    }
}
