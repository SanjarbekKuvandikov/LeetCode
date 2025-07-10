public class FlippingImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int [][] result = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            int left = 0;
            int right = image[i].length - 1;
            while (left < image.length && right >= 0) {
                result[i][left] = image[i][right] == 1 ? 0 : 1;
                left++;
                right--;
            }
        }
        return result;
    }
}
