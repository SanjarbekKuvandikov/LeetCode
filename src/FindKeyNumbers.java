public class FindKeyNumbers {
    public int generateKey(int num1, int num2, int num3) {
        String st1 = converter(num1);
        String st2 = converter(num2);
        String st3 = converter(num3);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 4; i++){
            int n1 = Integer.parseInt(String.valueOf(st1.charAt(i)));
            int n2 = Integer.parseInt(String.valueOf(st2.charAt(i)));
            int n3 = Integer.parseInt(String.valueOf(st3.charAt(i)));

            int min = Math.min(Math.min(n1,n2),n3);

            result.append(min);
        }

        return Integer.parseInt(result.toString());
    }
    private String converter(int num){
        StringBuilder string =  new StringBuilder();
        int digits = String.valueOf(num).length();
        while (digits < 4){
            string.append("0");
            digits++;
        }
        string.append(num);
        return string.toString();
    }
}
