import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()";
        Solution sol = new Solution();
        boolean result = sol.checkValidString(s);
        System.out.println(result);
    }
}

// Edge case. I didn't take into account where the * were added or not added.
// Come back to this once I study backtracking

class Solution {
    public boolean checkValidString(String s) {
        Stack<Character> bracketStack = new Stack<>();
        Stack<Character> starStack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c != ')') {
                if (c == '*') {
                    starStack.add(c);
                } else {
                    bracketStack.add(c);
                }
            }
            if (c == ')') {
                if (!bracketStack.isEmpty()) {
                    bracketStack.pop();
                } else {
                    if (starStack.isEmpty()) {
                        return false;
                    } else {
                        starStack.pop();
                    }
                }
            }
        }
        return bracketStack.isEmpty();
    }
}
