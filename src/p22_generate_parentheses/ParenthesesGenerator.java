package p22_generate_parentheses;

import java.util.ArrayList;
import java.util.List;

public class ParenthesesGenerator {

    public List<String> generateParentheses(int n) {
        List<String> ans = new ArrayList<>();
        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; ++c)
                for (String left : generateParentheses(c))
                    for (String right : generateParentheses(n - 1 - c))
                        ans.add("(" + left + ")" + right);
        }
        return ans;
    }
}
