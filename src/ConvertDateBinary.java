public class ConvertDateBinary {
    public String convertDateToBinary(String date) {
        StringBuilder answer = new StringBuilder();
        StringBuilder current = new StringBuilder();

        for (int i = 0 ; i < date.length(); i++){

            if (date.charAt(i) != '-'){
                current.append(date.charAt(i));
            }
            else {
                int digit = Integer.parseInt(current.toString());
                answer.append(Integer.toBinaryString(digit));
                answer.append('-');
                current.setLength(0);
            }
        }

        int digit = Integer.parseInt(current.toString());
        answer.append(Integer.toBinaryString(digit));

       return answer.toString();
    }
}
