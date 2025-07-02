import java.util.*;

public class FindingDigitEvenNumbers {
    public int[] findEvenNumbers(int[] digits) {

        List<List<Integer>> combinations =  new ArrayList<>();
        int n = digits.length;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                for (int k = j + 1; k < n; k++){
                    List<Integer> combination = Arrays.asList(digits[i], digits[j], digits[k]);
                    combinations.add(combination);
                }
            }
        }

        Set<Integer> numbers = new HashSet<>();
        for (List<Integer> list : combinations){

            List<Integer> permutation = threeNumbers(list);
            for (int num : permutation){
                if (num >= 100 && num % 2 == 0){
                    numbers.add(num);
                }
            }
        }
        List<Integer> sortedList = new ArrayList<>(numbers);
        Collections.sort(sortedList);

        int [] result = new int[sortedList.size()];
        for (int i = 0; i < result.length; i++){
            result[i] = sortedList.get(i);
        }
        return result;
    }
    private List<Integer> threeNumbers(List<Integer> list){
        int first = list.get(0); // 1
        int second = list.get(1); // 2
        int third = list.get(2);  // 3

        List<Integer> result = new ArrayList<>();

        result.add(first * 100 + second * 10 + third);
        result.add(first * 100 +third * 10 + second);
        result.add(second * 100 + first * 10 + third);
        result.add(second * 100 + third * 10 + first);
        result.add(third * 100 + first * 10 + second);
        result.add(third * 100 + second * 10 + first);

        return result;
    }
}
