public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        boolean b=false;
        String st = String.valueOf(x);
        String st1 = "";
        for (int i = st.length()-1;i>=0;i--){
            st1 +=st.charAt(i);
        }
        int count = 0;
        for (int i=0;i<st.length();i++){
            if (st.charAt(i) == st1.charAt(i)){
                count ++;
            }
        }
        if (count == st.length()){
            b = true;
        }
        return b;
    }
}
