public class CheckNumbersAreAscendingSentence {
    public boolean areNumbersAscending(String s) {
        int old = 0;
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()){
            if (c >= '0' && c <= '9'){
                str.append(c);
            }else if (!str.isEmpty()){
                int new_int = Integer.parseInt(str.toString());
                if (old > new_int) return false;
                old = new_int;
                str.setLength(0);
            }
        }

        if (!str.isEmpty()) {
            int new_int = Integer.parseInt(str.toString());
            return old < new_int;
        }

        return true;
    }
}
