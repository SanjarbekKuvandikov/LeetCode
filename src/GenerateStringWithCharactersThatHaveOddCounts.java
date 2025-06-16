public class GenerateStringWithCharactersThatHaveOddCounts {
    public String generateTheString(int n) {
        StringBuilder str = new StringBuilder();

        if (n % 2 == 1){
            while (n > 0){
                str.append("a");
                n--;
            }
        }else {
            str.append("a".repeat(Math.max(0, n - 1)));
            str.append("b");
        }

        return str.toString();
    }
}
