public class FinalValueVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int sum  = 0;
        for (String word : operations){
            sum += counter(word);
        }
        return sum;
    }
    private int counter(String word){
        int minus = 0;
        for (char c : word.toCharArray()){
            if (c == '-') minus++;
        }

        if (minus == 2) return -1;

        return 1;
    }
}
