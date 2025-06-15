public class CheckWordEqualsSummationTwoWords {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder str = new StringBuilder();
        for (char c : firstWord.toCharArray()){
            str.append((int)c - 97);
        }

        int first = Integer.parseInt(str.toString());
        str.setLength(0);

        for (char c : secondWord.toCharArray()){
            str.append((int)c - 97);
        }

        int second = Integer.parseInt(str.toString());
        str.setLength(0);
        for (char c : targetWord.toCharArray()){
            str.append((int)c - 97);
        }

        int target = Integer.parseInt(str.toString());


        return (first + second) == target;
    }
}
