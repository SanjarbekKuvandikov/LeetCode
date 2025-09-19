import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculateAmountPaidTaxes {
    public double calculateTax(int[][] brackets, int income) {
        double total = 0;
        int prev = 0;
        for (int[] bracket : brackets) {
            int upper = bracket[0];
            int percent = bracket[1];

            int taxable = Math.min(income, upper - prev);
            if (taxable <= 0) break;

            total += (double) taxable * percent / 100;
            income -= taxable;
            prev = upper;
        }

        return new BigDecimal(total).setScale(5, RoundingMode.HALF_UP).doubleValue();
    }
}
