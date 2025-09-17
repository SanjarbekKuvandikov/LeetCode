


public class RemoveLetterToEqualizeFrequency {
    public boolean equalFrequency(String word) {
        int[] arr = new int[26];

        for (char c : word.toCharArray()){
            arr[c - 'a']++;
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                arr[i]--;
                if (allSame(arr)) return true;
                arr[i]++;
            }
        }
        return false;
    }
    private boolean allSame(int[] arr){
        int curr = 0;
        for (int num : arr){
            if (num == 0) continue;
            if (curr == 0) curr = num;
            else if (curr != num) return false;
        }
        return true;
    }
}
