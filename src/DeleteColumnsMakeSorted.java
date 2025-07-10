public class DeleteColumnsMakeSorted {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for (int i = 0; i < strs[0].length(); i++){
            StringBuilder str = new StringBuilder();
            for (String word : strs){
                str.append(word.charAt(i));
            }
            if (!checker(str.toString())) count++;
        }
        return count;
    }
    private boolean checker(String word){
        for (int i = 1; i < word.length(); i++){
            if (word.charAt(i - 1) > word.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
