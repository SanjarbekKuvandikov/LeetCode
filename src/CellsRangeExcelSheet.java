import java.util.ArrayList;
import java.util.List;

public class CellsRangeExcelSheet {
    public List<String> cellsInRange(String s) {
        List<String> list = new ArrayList<>();

        char colStart = s.charAt(0);
        char colEnd = s.charAt(3);
        int rowStart = s.charAt(1) - '0';
        int rowEnd = s.charAt(4) - '0';


        for (char c = colStart; c <= colEnd; c++){
            for (int i = rowStart; i <= rowEnd; i++){
                list.add("" + c + i);
            }
        }

        return list;
    }
}
