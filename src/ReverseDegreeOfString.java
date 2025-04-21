public class ReverseDegreeOfString {
    public int reverseDegree(String s) {
        int sum = 0;
        int index = 1;

        for (int i = 0; i < s.length(); i++){
            int num = 'z' - s.charAt(i) + 1;
            sum += num * index;
            index++;
        }

        return sum;
    }
}
