public class CapitalizeTitle {
    public String capitalizeTitle(String title) {
        StringBuilder str = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (char c : title.toCharArray()){
            if (c == ' '){
                result.append(checker(str)).append(' ');
                str.setLength(0);
            }else {
                str.append(c);
            }
        }
        result.append(checker(str));
        return result.toString();
    }
    private String checker(StringBuilder str){
        if (str.length() < 3){
            return str.toString().toLowerCase();
        }

        StringBuilder string = new StringBuilder(str.toString().toLowerCase());
        char first = (char) (string.charAt(0) - 32);
        string.setCharAt(0, first);

        return string.toString();
    }
}
