

public class ExistenceSubstringStringItsReverse {
    public boolean isSubstringPresent(String s) {
        for (int i = s.length() - 2; i >= 0; i--) {
            String str = "" + s.charAt(i + 1) + s.charAt(i);
            if (s.contains(str)) return true;
        }
        return false;
    }
}
