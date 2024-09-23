public class AddDigits {
    public int addDigits(int num) {
        if (num < 0 || num > Integer.MAX_VALUE){
            return 0;
        }
        while (num>9){
            int x = num;
            num = aylantiruvchi(x);
        }
        return num;
    }
    public static int aylantiruvchi(int num){
        int sum =0;
        while (num>0){
            sum+=num % 10;
            num= num/10;
        }
         return sum;
    }
}
