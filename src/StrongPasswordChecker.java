

public class StrongPasswordChecker {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) return false;

        return duplicate(password)
                && lowercase(password)
                && uppercase(password)
                && special(password)
                && digit(password);
    }
    private boolean duplicate(String pass){
        for (int i = 1; i < pass.length(); i++) {
            if (pass.charAt(i) == pass.charAt(i - 1)) return false;
        }
        return true;
    }

    private boolean lowercase(String pass){
        return pass.matches(".*[a-z].*");
    }

    private boolean uppercase(String pass){
        return pass.matches(".*[A-Z].*");
    }

    private boolean special(String pass){
        return pass.matches(".*[!@#$%^&*()\\-+].*");
    }

    private boolean digit(String pass){
        return pass.matches(".*[0-9].*");
    }
}
