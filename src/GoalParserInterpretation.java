public class GoalParserInterpretation {
    public String interpret(String command) {
        int n = command.length()-1;
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < command.length(); i++){
            if (command.charAt(i - 1) == '('){
                if (command.charAt(i) == ')'){
                    str.append('o');
                }
            }else if (command.charAt(i - 1) != ')'){
                str.append(command.charAt(i - 1));
            }
        }
        if (command.charAt((n)) != '(' && command.charAt((n)) != ')'){
            str.append(command.charAt((n)));
        }
        return str.toString();
    }
}
