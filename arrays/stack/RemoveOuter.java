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
    public static void main(String[] args) {
        RemoveOuter removeOuter = new RemoveOuter();
        System.out.println(removeOuter.removeOuterParentheses("()"));
        System.out.println(removeOuter.removeOuterParentheses("()()"));
        System.out.println(removeOuter.removeOuterParentheses("(()()())"));
        System.out.println(removeOuter.removeOuterParentheses("(()())(())"));
    }
}
