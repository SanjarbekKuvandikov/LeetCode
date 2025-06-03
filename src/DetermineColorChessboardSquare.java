import java.util.List;

public class DetermineColorChessboardSquare {
    public boolean squareIsWhite(String coordinates) {
        List<Character> white = List.of('b','d','f','h');

        char c = coordinates.charAt(0);
        int num = Integer.parseInt(String.valueOf(coordinates.charAt(1)));

        if (white.contains(c)){
            return num % 2 == 1;
        }else {
            return num % 2 == 0;
        }

    }
}
