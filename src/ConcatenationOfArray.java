public class ConcatenationOfArray {
    public int[] getConcatenation(int[] num) {
        int n = num.length * 2;
        int [] answer =  new int[n];
        int index = 0;
        for (int i = 0; i < n; i++){
            if (index >= num.length){
                index = 0;
            }
            answer[i] = num[index];
            index++;
        }

        return answer;
    }
}
