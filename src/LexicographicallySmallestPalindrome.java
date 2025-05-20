public class LexicographicallySmallestPalindrome {
    public String makeSmallestPalindrome(String s) {
        StringBuilder str = new StringBuilder(s);

        int first = 0;
        int last = str.length()-1;

        while (first < last){
            if (str.charAt(first) != str.charAt(last)){
                char minChar = (char) Math.min(str.charAt(first), str.charAt(last));

                str.setCharAt(first, minChar);

                str.setCharAt(last, minChar);
            }
            first++;
            last--;
        }


        return str.toString();
    }
}
