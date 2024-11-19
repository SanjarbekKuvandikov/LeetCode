public class BaseSeven {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        int number = Math.abs(num);

        while (number != 0) {
            int qoldiq = number % 7;
            result.append(qoldiq);
            number /= 7;
        }

        if (num < 0) {
            result.append("-");
        }

        return result.reverse().toString();
    }
}
