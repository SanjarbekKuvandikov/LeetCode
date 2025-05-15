import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtracking(new StringBuilder(),0,0,n,result);
        return result;
    }
    private void backtracking(StringBuilder st,int open_count, int close_count, int n, List<String> result){
        if (st.length() == n*2){
            result.add(st.toString());
            return;
        }
        if (open_count < n){
            st.append('(');
            backtracking(st,open_count+1,close_count,n,result);
            st.deleteCharAt(st.length()-1);
        }if (close_count < open_count){
            st.append(')');
            backtracking(st,open_count,close_count+1,n,result);
            st.deleteCharAt(st.length()-1);
        }

    }
}
