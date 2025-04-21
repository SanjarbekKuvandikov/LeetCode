public class MaximumContainers {
    public int maxContainers(int n, int w, int maxWeight) {

        int lastMaxWeight = maxWeight / w;
        int maxSpace = n * n;

        return Math.min(lastMaxWeight,maxSpace);
    }
}
