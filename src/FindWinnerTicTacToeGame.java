import java.util.ArrayList;
import java.util.List;

public class FindWinnerTicTacToeGame {
    public String tictactoe(int[][] moves) {
        List<Integer> X = new ArrayList<>();
        List<Integer> O = new ArrayList<>();

        for (int i = 0; i < moves.length; i++) {
            if (i  % 2 == 0) X.add(checker(moves[i]));
            else O.add(checker(moves[i]));
        }

        if (findWinner(X)) return "A";
        if (findWinner(O)) return "B";
        if (moves.length == 9) return "Draw";

        return "Pending";
    }
    private int checker(int[] move){
        int zero = move[0];
        int one = move[1];
        if (zero == 0){
            if (one == 0) return 1;
            if (one == 1) return 2;
            if (one == 2) return 3;
        }
        if (zero == 1){
            if (one == 0) return 4;
            if (one == 1) return 5;
            if (one == 2) return 6;
        }
        if (zero == 2){

            if (one == 0) return 7;
            if (one == 1) return 8;
            if (one == 2) return 9;
        }

        return 0;
    }
    private boolean findWinner(List<Integer> list){

        if (list.contains(1)){
            if (list.contains(2) && list.contains(3)) return true;
            if (list.contains(4) && list.contains(7)) return true;
            if (list.contains(5) && list.contains(9)) return true;
        }

        if (list.contains(2)){
            if (list.contains(5) && list.contains(8)) return true;
        }

        if (list.contains(3)){
            if (list.contains(6) && list.contains(9)) return true;
            if (list.contains(5) && list.contains(7)) return true;
        }

        if (list.contains(4)){
            if (list.contains(5) && list.contains(6)) return true;
        }

        if (list.contains(7)){
            return list.contains(8) && list.contains(9);
        }

        return false;
    }
}
