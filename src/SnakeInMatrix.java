import java.util.List;

public class SnakeInMatrix {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0;
        int j = 0;
        int answer = 0;

        int start = 0;
        int [][] matrix = new int[n][n];
        for (int a = 0; a < matrix.length; a++){
            for (int b = 0; b < matrix[0].length; b++){
                matrix[a][b] = start;
                start++;
            }
        }

        for (String command : commands) {

            switch (command) {
                case "DOWN" -> i++;
                case "RIGHT" -> j++;
                case "UP" -> i--;
                case "LEFT" -> j--;
            }

            answer = (i * n) + j;
        }

        return answer;
    }
}
