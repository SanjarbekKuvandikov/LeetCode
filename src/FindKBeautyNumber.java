public class FindKBeautyNumber {
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        int len = k;
        String str = String.valueOf(num);

        while (len <= str.length()){
            int a = Integer.parseInt(str.substring(len - k,len));
            if (a > 0 && num % a == 0) count++;
            len++;
        }

        return count;
    }
}
