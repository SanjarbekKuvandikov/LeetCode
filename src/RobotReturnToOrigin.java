public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int sum = 0;

        for (int i = 0; i < moves.length(); i++){

            switch (moves.charAt(i)){
                case 'R' -> sum += 1;
                case 'L' -> sum += (-1);
                case 'U' -> sum += 3;
                case 'D' -> sum += (-3);
            }
        }
        return sum == 0;
    }
    /*
int x = 0 , y = 0;

        for (int i = 0; i < moves.length(); i++){

            switch (moves.charAt(i)){
                case 'R' -> x++;
                case 'L' -> x--;
                case 'U' -> y++;
                case 'D' -> y--;
            }
        }
        return x == 0 && y == 0;

     */
}
