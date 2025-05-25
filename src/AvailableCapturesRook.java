public class AvailableCapturesRook {
    public int numRookCaptures(char[][] board) {
        int rock_row = 0;
        int rock_col = 0;
        int available_capture = 0;

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j] == 'R'){
                    rock_row = i;
                    rock_col = j;
                    break;
                }
            }
        }
        available_capture += up(board,rock_col,rock_row);
        available_capture += down(board,rock_col,rock_row+1);
        available_capture += left(board,rock_col,rock_row);
        available_capture += right(board,rock_col+1,rock_row);

        return available_capture;
    }
    private int up (char[][] board,int col, int row){
        while (row >= 0){
            if (board[row][col] == 'B') return 0;
            if (board[row][col] == 'p') return 1;
            row--;
        }
        return 0;
    }
    private int down(char[][] board,int col, int row){
        while (row <= 7){
            if (board[row][col] == 'B') return 0;
            if (board[row][col] == 'p') return 1;
            row++;
        }
        return 0;
    }
    private int left(char[][] board,int col, int row){
        while (col >= 0){
            if (board[row][col] == 'B') return 0;
            if (board[row][col] == 'p') return 1;
            col--;
        }
        return 0;
    }
    private int right (char[][] board,int col, int row){
        while (col <= 7){
            if (board[row][col] == 'B') return 0;
            if (board[row][col] == 'p') return 1;
            col++;
        }
        return 0;
    }
}
