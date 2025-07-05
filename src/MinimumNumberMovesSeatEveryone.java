import java.util.Arrays;

public class MinimumNumberMovesSeatEveryone {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;
        for (int i = 0; i < seats.length; i++){
            if (students[i] >= seats[i]){
                moves += students[i] - seats[i];
            }else {
                moves += seats[i] - students[i];
            }
        }

        return moves;
    }
}
