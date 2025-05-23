import java.util.ArrayList;
import java.util.List;

public class DecodeMessage {
    public String decodeMessage(String key, String message) {
        List<Character> list = List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        List<Character> key_list =  new ArrayList<>();

        for (char c : key.toCharArray()){
            if (c != ' ' && !key_list.contains(c)) {
                key_list.add(c);
            }
        }
        StringBuilder str = new StringBuilder();
        for (char c : message.toCharArray()){
            if (c != ' '){
                int index = key_list.indexOf(c);
                str.append(list.get(index));
            }else {
                str.append(c);
            }
        }

        return str.toString();
    }
}
