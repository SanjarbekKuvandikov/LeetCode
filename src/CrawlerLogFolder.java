public class CrawlerLogFolder {
    public int minOperations(String[] logs) {
        int sum = 0;
        for (String log : logs){
                if (log.equals("./")) sum += 0;
                else if (log.equals("../")) if (sum > 0) sum -= 1;
                else sum++;
        }
        return sum;
    }
}
