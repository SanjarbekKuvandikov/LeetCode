public class IntegerToRoman {
    public String intToRoman(int num) {
        int[]  roman={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] code={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        String res="";
        for(int i=12;i>=0;i--){
            while(num>=roman[i]){
                res += code[i];
                num -= roman[i];
            }
        }
        return res;
    }
}
