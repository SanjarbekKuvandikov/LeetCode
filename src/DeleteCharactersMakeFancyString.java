public class DeleteCharactersMakeFancyString {
    public String makeFancyString(String s) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        char prev = ' ';

        for (int i = 0 ; i < s.length();i++){
            char cur = s.charAt(i);

            if (cur == prev){
                count++;
            }else {
                prev = cur;
                count = 1;
            }
            if (count < 3){
                str.append(s.charAt(i));
            }
        }

        return str.toString();
    }
}
