import java.util.Arrays;

public class AverageSalaryExcludingMinimumMaximumSalary {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int sum = 0;
        int count = 0;
        for (int i = 1; i < salary.length - 1 ; i++) {
            sum += salary[i];
            count++;
        }
        double value = (double) (sum) / count;
        return Math.round(value * 1e5) / 1e5;
    }
}
