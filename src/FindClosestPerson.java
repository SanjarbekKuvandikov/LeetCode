public class FindClosestPerson {
    public int findClosest(int x, int y, int z) {
        int dif_x_z = Math.abs(x - z);
        int dif_y_z = Math.abs(y - z);

        if (dif_x_z == dif_y_z) return 0;
        if (dif_y_z < dif_x_z) return 2;

        return 1;
    }
}
