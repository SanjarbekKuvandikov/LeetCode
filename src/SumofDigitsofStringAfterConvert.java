public class SumofDigitsofStringAfterConvert {
    public int getLucky(String s, int k) {

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i <s.length(); i++) {
            sb.append(s.charAt(i) - 96);
        }
        while (k>0){
            sum = 0;
            for (int i = 0; i <sb.length(); i++) {
                sum +=  Character.getNumericValue(sb.charAt(i));
            }
            sb = new StringBuilder();
            sb.append(sum);
            k--;
        }

        return sum;
    }
}
