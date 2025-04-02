import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombination {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.isEmpty()){
            return result;
        }

        Map<Character,String> telephone = Map.of(
                '2',"abc",
                '3',"def",
                '4',"ghi",
                '5',"jkl",
                '6',"mno",
                '7',"pqrs",
                '8',"tuv",
                '9',"wxyz"

        );
        combination(result, digits, telephone, new StringBuilder(),0);
        return result;
    }
    private void combination(List<String> result, String digits, Map<Character,String> telephone,
                             StringBuilder comb, int index){
        if (index == digits.length()){
            result.add(comb.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = telephone.get(digit);
        for (char letter : letters.toCharArray()){
            comb.append(letter);
            combination(result,digits,telephone,comb,index+1);
            comb.deleteCharAt(comb.length()-1);
        }
    }

}
