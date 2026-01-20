package arrays.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinAddToMakeValid {
    public int minAddToMakeValid1(String s) {
        int count = 0;
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }else {
                if(stack.isEmpty()){
                    count++;
                }else {
                    stack.pop();
                }
            }
        }
        return count+stack.size();
    }

    public static void main(String[] args) {
        MinAddToMakeValid sol = new MinAddToMakeValid();
        System.out.println(sol.minAddToMakeValid1("()"));
        System.out.println(sol.minAddToMakeValid1("()))"));
        System.out.println(sol.minAddToMakeValid1("((("));

    }
}
