

public class NumberLaserBeamsBank {
    public int numberOfBeams(String[] bank) {
        int laser = 0;
        int prev = 0;
        for (String word : bank){
            int devices = checker(word);
            if (devices == 0) continue;

            laser += prev * devices;
            prev = devices;
        }
        return laser;
    }
    private int checker(String word){
        int ones  = 0;
        for (char c : word.toCharArray()){
            if (c == '1') ones++;
        }
        return ones;
    }
}
