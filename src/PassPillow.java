public class PassPillow {
    public int passThePillow(int n, int time) {
        int index = 0;
        int ns = 1;
        boolean checker = false;

        while (time > 0){
            if (ns == n && !checker){
                checker = true;
            }else if (ns == 1 && checker){
                checker = false;
            }

            if (!checker){
                ns++;
            }
            else{
                ns--;
            }

            index =  ns;

            time--;
        }
        return index;
    }
}
