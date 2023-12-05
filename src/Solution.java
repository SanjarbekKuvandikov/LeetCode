import java.util.Scanner;

public class Solution {
    public int lengthOfLastWord(String s){
        int index1 = 0, index = 0,count = 0;
        int lastindex = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                index1 = i;
                break;
            }
        }
        for (int i = index1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                index = i;
                count ++;
                break;
            }
        }
        if (count == 0){
            for (int i=index; i <= index1 ;i++){
                lastindex++;
            }
        }

        else if (count>0) {
            for (int i = index + 1; i <= index1; i++) {
                lastindex++;
            }
        }

        return lastindex;
    }
}
