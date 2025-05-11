public class SmallestNumberWithAllSetBits {
    public int smallestNumber(int n) {

        while (true){
            if (checker(Integer.toBinaryString(n))){
                return n;
            }
            n++;
        }

    }

    private boolean checker(String str){
        for (char c : str.toCharArray()){
            if (c != '1'){
                return false;
            }
        }

        return true;
    }
}
/*
int x = 1;
    while (x < n) {
        x = (x << 1) | 1;
    }
    return x;
 */
