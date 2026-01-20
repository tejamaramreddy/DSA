package arrays.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (c == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    }else {
                        return false;
                    }
                }
                if (c == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    }else {
                        return false;
                    }
                }
                if (c == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    }else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("{[]()}"));
        System.out.println(validParentheses.isValid("{[(])}"));
        System.out.println(validParentheses.isValid("()"));
        System.out.println(validParentheses.isValid("{}()[]"));
        System.out.println(validParentheses.isValid("(])"));


    }
}
