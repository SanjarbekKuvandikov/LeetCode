public class DistributeCandiesPeople {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result =  new int[num_people];
        int index = 0;
        int num = 1;

        while (candies > 0){
            if (index == num_people){
                index = 0;
            }
            if (candies < num) {
                result[index] += candies;
                break;
            }
            result[index] += num;


            candies -= num;
            num++;
            index++;
        }
        return result;
    }
}
