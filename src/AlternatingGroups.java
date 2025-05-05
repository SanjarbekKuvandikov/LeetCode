public class AlternatingGroups {
    public int numberOfAlternatingGroups(int[] colors) {
        int group = 0;
        int first = 0;
        int second = 1;
        int third = 2;

        while (first < colors.length){

            if (second == colors.length){
                second = 0;
            }
            if (third == colors.length){
                third = 0;
            }

            if (colors[first] != colors[second] && colors[second] != colors[third]){
                group++;
            }
            first++;
            second++;
            third++;

        }

        return group;
    }
}
