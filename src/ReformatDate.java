public class ReformatDate {
    public String reformatDate(String date) {
        StringBuilder result = new StringBuilder();
        for (char c : date.toCharArray()){
            if (c == ' ') break;
            else result.append(c);
        }
        if (result.length() == 4){
            result.setLength(0);
            //year
            result.append(date.substring(9)).append('-');
            //month
            result.append(month(date.substring(5,8))).append('-');
            //day
            result.append(date, 0, 2);
        }else {
            result.setLength(0);
            //year
            result.append(date.substring(8)).append('-');
            //month
            result.append(month(date.substring(4,7))).append('-');
            //day
            result.append('0').append(date, 0, 1);
        }
        return result.toString();
    }
    private String month(String str){
        switch (str){
            case "Jan" -> {
                return "01";
            }
            case "Feb" -> {
                return "02";
            }
            case "Mar" -> {
                return "03";
            }
            case "Apr" -> {
                return "04";
            }
            case "May" -> {
                return "05";
            }
            case "Jun" -> {
                return "06";
            }
            case "Jul" -> {
                return "07";
            }
            case "Aug" -> {
                return "08";
            }
            case "Sep" -> {
                return "09";
            }
            case "Oct" -> {
                return "10";
            }
            case "Nov" -> {
                return "11";
            }
            case "Dec" -> {
                return "12";
            }
        }
        return "";
    }
}
