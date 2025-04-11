import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // Test Case 1
//        String[] tokens = {"2", "1", "+", "3", "*"};
        // Test Case 2
//        String[] tokens = {"4", "13", "5", "/", "+"};
        // Test Case 3
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(sol.evalRPN(tokens));
    }
}

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                int number1 = stack.pop();
                int number2 = stack.pop();
                int sum = number1 + number2;
                stack.push(sum);
            } else if (token.equals("-")) {
                int number1 = stack.pop();
                int number2 = stack.pop();
                int difference = number2 - number1;
                stack.push(difference);
            } else if (token.equals("*")) {
                int number1 = stack.pop();
                int number2 = stack.pop();
                int result = number1 * number2;
                stack.push(result);
            } else if (token.equals("/")) {
                int number1 = stack.pop();
                int number2 = stack.pop();
                int result = number2 / number1;
                stack.push(result);
            } else {
                int number = Integer.parseInt(token);
                stack.push(number);
            }
        }
        return stack.pop();
    }
}
