public class NumberChangingKeys {
    public int countKeyChanges(String s) {
        String news = s.toLowerCase();
        int count = 0;
        for (int i = 1; i < news.length(); i++){
            if (news.charAt(i-1) != news.charAt(i)){
                count++;
            }
        }

        return count;
    }
}
