public class TheEmployeeThatWorkedLongestTask {
    public int hardestWorker(int n, int[][] logs) {
        int employee = logs[0][0];
        int times = logs[0][1];
        int curr = logs[0][1];

        for (int i = 1; i < logs.length; i++){
            int duration = logs[i][1] - curr;

            if (times > duration){
                employee = logs[i][0];
                times = duration;
            }
            if (times == duration) {
                employee = Math.min(employee,logs[i][0]);
            }

            curr = logs[i][1];
        }
        return employee;
    }
}
