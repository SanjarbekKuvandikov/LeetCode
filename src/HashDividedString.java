
public class HashDividedString {
    public String stringHash(String s, int k) {
        StringBuilder str = new StringBuilder();
        int index = 0;
        while (index < s.length()) {

            int end = Math.min(index + k, s.length());
            String word = s.substring(index, end);
            str.append(worker(word));
            index = end;

        }

        return str.toString();
    }
    private Character worker(String word){
        int sum = 0;
        for (char c : word.toCharArray()){
            sum += c - 'a';
        }

        return (char) ('a' + (sum % 26));
    }
}
