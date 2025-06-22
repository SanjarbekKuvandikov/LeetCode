public class CountAsterisks {
    public int countAsterisks(String s) {
        boolean pair = false;
        int count = 0;
        for (char c : s.toCharArray()){
            if (c == '|'){
             pair =  !pair;
            }else if (c == '*' && !pair) count++;
        }
        return  count;
    }
}
