public class ExcelSheetColumn {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int qoldiq = columnNumber % 26;
            result.insert(0, (char) (qoldiq + 'A'));
            columnNumber /= 26;
        }
        return result.toString();
    }
}
