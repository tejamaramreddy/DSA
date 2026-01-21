package arrays.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ScoreOfParentheses {
    public int scoreOfParentheses(String s){
        Deque<Integer> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(0);
            }
            else {
                int top = stack.pop();
                int score;
                if(top == 0){
                    score = 1;
                }else {
                    score = top * 2;
                }
                if(!stack.isEmpty()){
                    stack.push(stack.pop() + score);
                }else{
                    stack.push(score);
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
    ScoreOfParentheses s = new ScoreOfParentheses();
        System.out.println(s.scoreOfParentheses("()"));
        System.out.println(s.scoreOfParentheses("()()"));
        System.out.println(s.scoreOfParentheses("(()())"));
    }
}
