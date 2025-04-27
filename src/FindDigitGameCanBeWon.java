public class FindDigitGameCanBeWon {
    public boolean canAliceWin(int[] nums) {
        int singleDigit = 0;
        int doubleDigit = 0;
        for (int num : nums){

            if (num < 10){
                singleDigit += num;
            }else {
                doubleDigit += num;
            }
        }

        if (singleDigit > doubleDigit || doubleDigit > singleDigit){
            return true;
        }

        return false;
    }
}
