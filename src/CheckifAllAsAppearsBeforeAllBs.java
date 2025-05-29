public class CheckifAllAsAppearsBeforeAllBs {
    public boolean checkString(String s) {
        int count = 0;
        char a = 'a';
        if (s.charAt(0) == 'a'){
            for (char c : s.toCharArray()){
                if (c != a){
                    a = c;
                    count++;
                }
                if (count >= 2) return false;
            }
        }else {
            for (char c : s.toCharArray()){
                if (c != 'b') return false;
            }
        }
        return true;
    }
}
