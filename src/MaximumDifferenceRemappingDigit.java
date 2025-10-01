public class MaximumDifferenceRemappingDigit {
    public int minMaxDifference(int num) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String str = String.valueOf(num);
        for (char c : str.toCharArray()){
            min = Math.min(min,findMin(c,str));
            max = Math.max(max,findMax(c,str));
        }
        return min;
    }
    private int findMin(char c , String str){
        StringBuilder strb = new StringBuilder();
        for (char a : str.toCharArray()){
            if (a == c) strb.append('0');
            else strb.append(a);
        }
        return Integer.parseInt(strb.toString());
    }
    private int findMax(char c , String str){
        StringBuilder strb = new StringBuilder();
        for (char a : str.toCharArray()){
            if (a == c) strb.append('9');
            else strb.append(a);
        }
        return Integer.parseInt(strb.toString());
    }
}
