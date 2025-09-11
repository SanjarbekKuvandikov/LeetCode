public class FindEncryptedString {
    public String getEncryptedString(String s, int k) {
        StringBuilder str = new StringBuilder();
        StringBuilder news = new StringBuilder(s);
        int count = 0;

        while (count < s.length()){
            while (count + k >= news.length()){
                    news.append(s);
            }

            str.append(news.charAt(count + k));
            count++;
        }
        return str.toString();
    }
}
