import java.util.List;

public class RotatedDigits {
    public int rotatedDigits(int n) {
        List<Character> valid = List.of('0','2','1','5','6','8','9');
        List<Character> good = List.of('2','5','6','9');
        int count = 0;
        boolean isValid;
        boolean isChanged;
        for (int i = 0; i <= n; i++){
            isValid = true;
            isChanged = false;
            String s = String.valueOf(i);
            for (char digits : s.toCharArray()){
                if (!valid.contains(digits)){
                    isValid = false;
                }
                if (good.contains(digits)){
                    isChanged = true;
                }
            }

            if (isValid && isChanged){
                count++;
            }
        }
        return count;
    }
}
