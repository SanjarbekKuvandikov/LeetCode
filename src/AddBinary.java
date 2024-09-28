public class AddBinary {
    public String addBinary(String a, String b) {
        int x = a.length()-1;
        int y = b.length()-1;
        int current = 0;
        StringBuilder result = new StringBuilder();
        while (x>=0 || y>=0){

            int sum = current;
            if (x>=0){
                sum += a.charAt(x) - '0';
            }
            if (y>=0){
                sum += b.charAt(y) - '0';
            }
            if (sum ==0 || sum == 1){
                result.append(sum);
                current = 0;
            }
            else if (sum == 2){
                result.append('0');
                current = 1;
            }
            else {
                result.append('1');
                current = 1;
            }
            x--;
            y--;
        }
        if (current == 1){
            result.append('1');
        }
        return result.reverse().toString();
    }
}
