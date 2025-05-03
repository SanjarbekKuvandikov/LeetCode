
public class FruitsIntoBaskets {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int notPlaced = 0;

        for (int fruit : fruits) {
            for (int j = 0; j < baskets.length; j++) {
                if (fruit <= baskets[j]) {
                    baskets[j] = 0;
                    break;
                }
            }
        }
        for (int num : baskets){
            if (num > 0){
                notPlaced++;
            }
        }
        return notPlaced;
    }
}
