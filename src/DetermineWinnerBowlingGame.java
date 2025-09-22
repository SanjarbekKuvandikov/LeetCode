public class DetermineWinnerBowlingGame {
    public int isWinner(int[] player1, int[] player2) {
        int score1 = 0, score2 = 0;

        for (int i = player1.length - 1; i >= 0 ; i--) {
            if (i - 1 >= 0 && player1[i - 1] == 10){
                score1 += 2 * player1[i];
            }
            else if (i - 2 >= 0 && player1[i - 2] == 10){
                score1 += 2 * player1[i];
            }
            else score1 += player1[i];
        }

        for (int i = player2.length - 1; i >= 0 ; i--) {
            if (i - 1 >= 0 && player2[i - 1] == 10){
                score2 += 2 * player2[i];
            }
            else if (i - 2 >= 0 && player2[i - 2] == 10){
                score2 += 2 * player2[i];
            }
            else score2 += player2[i];
        }
        if (score1 > score2) return 1;
        if (score2 > score1) return 2;

        return 0;
    }
}
