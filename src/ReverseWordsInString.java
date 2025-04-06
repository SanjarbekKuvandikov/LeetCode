public class ReverseWordsInString {
    public String reverseWords(String s) {
        String [] splits = s.split(" ");
        StringBuilder reverse = new StringBuilder();

        for (int i = 0; i < splits.length; i++) {
            StringBuilder builders = new StringBuilder(splits[i]);
            builders.reverse();
            reverse.append(builders);

            if (i < splits.length - 1) {
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }
}
