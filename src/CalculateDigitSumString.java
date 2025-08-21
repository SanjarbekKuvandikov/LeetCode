public class CalculateDigitSumString {
    public String digitSum(String s, int k) {
        StringBuilder main =  new StringBuilder(s);

        while (main.length() > k){

            StringBuilder curr = new StringBuilder();
            int start = 0;
            int end = k;

            while (true){
                if (end >= main.length()){
                    curr.append(sum(main.substring(start)));
                    break;
                }
                curr.append(sum(main.substring(start,end)));
                start += k;
                end += k;
            }

            main.setLength(0);
            main = curr;
        }
       return main.toString();
    }
    private int sum (String str){
        int sum = 0;
        for (char c : str.toCharArray()){
            sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }
}
