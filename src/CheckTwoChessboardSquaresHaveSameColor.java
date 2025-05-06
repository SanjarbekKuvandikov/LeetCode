public class CheckTwoChessboardSquaresHaveSameColor {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        boolean a = check(coordinate1);
        boolean b = check(coordinate2);

        return a == b;
    }
    private boolean check(String a){
        int col = a.charAt(0) - 'a';
        int row = a.charAt(1) - '0';
        return (col + row) % 2 == 0;
    }
}
