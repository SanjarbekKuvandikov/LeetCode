public class StudentAttendanceRecord {
    public boolean checkRecord(String s) {
        int absent = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'A'){
                absent++;
                if (absent >= 2) return false;
            }
        }

        return !s.contains("LLL");
    }
}
