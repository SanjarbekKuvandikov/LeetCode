public class MaximumValueStringArray {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (String str : strs){
            boolean digit = true;

            for (char c : str.toCharArray()){
                if (!Character.isDigit(c)){
                    digit = false;
                    break;
                }
            }

            if (digit) {
                max = Math.max(max, Integer.parseInt(str));
            } else {
                max = Math.max(max, str.length());
            }
        }

        return max;
    }
}
