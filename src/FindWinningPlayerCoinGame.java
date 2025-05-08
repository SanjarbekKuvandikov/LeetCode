public class FindWinningPlayerCoinGame {
    public String winningPlayer(int x, int y) {
        String name;

        int possibleMoves = Math.min(x,(y / 4));

        if (possibleMoves % 2 == 0){
            name = "Bob";
        }else {
            name = "Alice";
        }


        return name;
    }
}
