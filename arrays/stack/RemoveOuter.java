package arrays.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveOuter {
    public String removeOuterParentheses(String S) {
        StringBuilder result = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch : S.toCharArray()){
            if(ch=='('){
                if(!stack.isEmpty()){
                    result.append(ch);
                }
                stack.push(ch);
            }else{
                stack.pop();
                if(!stack.isEmpty()){
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }

    public String removeOuterParentheses2(String S) {
        StringBuilder result = new StringBuilder();
        int balance = 0;
        for (char ch : S.toCharArray()) {
            if (ch == '(') {
                if (balance > 0) {
                    result.append(ch);
                }
                balance++;
            } else {
                balance--;
                if (balance > 0) {
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        RemoveOuter removeOuter = new RemoveOuter();
        System.out.println(removeOuter.removeOuterParentheses2("()"));
        System.out.println(removeOuter.removeOuterParentheses2("()()"));
        System.out.println(removeOuter.removeOuterParentheses2("(()()())"));
        System.out.println(removeOuter.removeOuterParentheses2("(()())(())"));
    }
}
