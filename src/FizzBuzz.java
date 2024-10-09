import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        int index = 1;
        while (index <= n){
            if (index % 3 == 0 && index % 5 == 0){
                list.add("FizzBuzz");
            }
            else if (index % 3 == 0){
                list.add("Fizz");
            }
            else if (index % 5 == 0){
                list.add("Buzz");
            }else{
                String forexam = String.valueOf(index);
                list.add(forexam);
            }
            index++;
        }
        return list;
    }
}
