import java.lang.reflect.Array;
import java.util.Arrays;

public class ConvertToTempearture {
    public double[] convertTemperature(double celsius) {
        double [] ans = new double[2];
        double kelvin = (celsius + 273.15);
        double fahrenheit = (celsius * 1.80 + 32.00);

        String formattedKelvin = String.format("%.5f", kelvin);
        String formattedFahrenheit = String.format("%.5f", fahrenheit);

        ans[0] = Double.valueOf(formattedKelvin);
        ans[1] = Double.valueOf(formattedFahrenheit);
        return ans;
    }
}
