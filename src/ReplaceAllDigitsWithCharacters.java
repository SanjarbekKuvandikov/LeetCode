public class ReplaceAllDigitsWithCharacters {
    public String replaceDigits(String s) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char first = s.charAt(i);

            if (Character.isDigit(first)) {
                int num =  Integer.parseInt(String.valueOf(first));
                first = (char)(num + s.charAt(i-1));
            }

            string.append(first);
        }

        return string.toString();
    }
}
