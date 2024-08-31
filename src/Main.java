import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int mas [] = {1,2,0,0};
         /*
       Solution989 sol = new Solution989();
        System.out.println(sol.addToArrayForm(mas,34));
   Solution sol=new Solution();
        System.out.println(sol.lengthOfLastWord(" sanjar"));*/
      /* Solution20 sol20 = new Solution20();
       System.out.println(sol20.isValid("([]}{)"));
       "{[]}" */
      /*Solution3 sol=new Solution3();
        System.out.println(sol.lengthOfLongestSubstring("abcabcbb"));
*/
 /*Solution1185 solution1185 =new Solution1185();
        System.out.println(solution1185.dayOfTheWeek(15,8,1993));

*/

/*Solution9 sol =new Solution9();
        System.out.println(sol.isPalindrome(-121));*/


/*Solution8 sol = new Solution8();
        System.out.println(sol.myAtoi("words and 987"));*/
     /*   Solution29 sol = new Solution29();
        System.out.println(sol.divide(-2147483648,-2147483648));*/



   String s= in.nextLine();
   char[] exam = s.toCharArray();
   for (int i=0;i<exam.length;i++){
       if (exam[i] == ' '){
           exam[i] = '.';
       }
   }
   String sexam= "";
   for (int i=0;i<exam.length;i++){
       sexam += exam[i];
   }

        System.out.println(sexam);



      /*  String s = "Hello World";
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


        System.out.println(lastindex);*/

    }
}

