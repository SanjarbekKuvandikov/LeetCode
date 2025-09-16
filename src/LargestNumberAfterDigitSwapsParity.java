public class LargestNumberAfterDigitSwapsParity {
    public int largestInteger(int num) {
        char[] str = String.valueOf(num).toCharArray();
        for (int i = 0; i < str.length; i++) {
            int index = findMax(i,str);
            if (index != - 1){
                char c = str[i];
                str[i] = str[index];
                str[index] = c;
            }
        }
        StringBuilder strb = new StringBuilder();
        for (char c : str){
            strb.append(c);
        }
        return Integer.parseInt(strb.toString());
    }
    private int findMax(int index,char[] str){
        int maxIndex = -1;
        for (int i = str.length - 1; i > index; i--) {
            if ((str[index] - '0') % 2 == (str[i] - '0') % 2) {
                if (maxIndex == -1 || str[i] > str[maxIndex]) {
                    maxIndex = i;
                }
            }
        }
        if (maxIndex != -1 && str[maxIndex] > str[index]) {
            return maxIndex;
        }
        return -1;
    }
}
