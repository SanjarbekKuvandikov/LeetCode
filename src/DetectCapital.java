public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        boolean ifcan = false;
        Character first = word.charAt(0);
        String subs = word.substring(1);
        if (word.length() == 1){
            ifcan = true;
        }
        else if (upper_or_lower(first) && lower(subs) || upper_or_lower(first) && upper(subs)){
            ifcan = true;
        }else if(!upper_or_lower(first) && lower(subs)){
            ifcan = true;
        }
        return ifcan;
    }
    boolean upper_or_lower(Character character){
        return character >= 'A' && character <= 'Z';
    }
    boolean upper(String word){
        int index = 0;
        boolean ifcan = false;
        while (index < word.length()){
            if (word.charAt(index) >= 'A' && word.charAt(index) <= 'Z'){
                ifcan = true;
            }
            else{
                ifcan = false;
                break;
            }
            index++;
        }
        return ifcan;
    }
    boolean lower(String word){
        int index = 0;
        boolean ifcan = false;
        while (index < word.length()){
            if (word.charAt(index) >= 'a' && word.charAt(index) <= 'z'){
                ifcan = true;
            }
            else{
                ifcan = false;
                break;
            }
            index++;
        }
        return ifcan;
    }
}
