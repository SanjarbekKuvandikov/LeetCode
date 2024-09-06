public class RomanToInteger {
    int value(char roman){
        if (roman == 'I') return 1;
        if (roman =='V')  return  5;
       if (roman == 'X')  return 10;
       if (roman =='L')   return 50;
       if (roman == 'C') return 100;
       if (roman == 'D') return 500;
       if (roman == 'M') return 1000;
       return -1;
    }
    public int romanToInt(String s) {
        int result=0;
for (int i=0; i<s.length(); i++){
    int first = value(s.charAt(i));
    if (i+1<s.length()){
        int second = value(s.charAt(i+1));
        if (first>=second){
            result= result+first;
        }
        else {
            result= result-first;
        }
    }
    else {
        result += first;
    }
}

return result;
    }
}
