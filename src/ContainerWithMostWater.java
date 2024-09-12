public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int right = height.length-1;
        int left = 0;
        while (left<right){
            int first = height[left];
            int second = height[right];
            int equal =0;
         if (first < second){
             equal = first;
         }
         else {
             equal =second;
         }
            int max = equal * (right -left);
            if (max > maxarea){
                maxarea = max;
            }

            if (height[left] < height[right] ){
                left ++;
            }
            else {
                right--;
            }
        }

        return maxarea;
    }
}
