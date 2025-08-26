public class TwoFurthestHousesWithDifferentColors {
    public int maxDistance(int[] colors) {
        int curr = -1, diff = 0;

        for (int i = 0; i < colors.length;){
            if(curr == colors[i]) i++;
            else {
                diff = Math.max(different(i,colors),diff);
                curr = colors[i];
            }
        }
        return diff;
    }private int different(int index, int[] num){
        for (int i = num.length - 1; i > index; i--){
            if (num[index] != num[i]) return i - index;
        }
        return 0;
    }
}
