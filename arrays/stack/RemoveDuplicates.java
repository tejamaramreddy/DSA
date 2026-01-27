package arrays.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveDuplicates {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                if (stack.peek() == ch) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveDuplicates s = new RemoveDuplicates();
        System.out.println(s.removeDuplicates("abbaca"));
    }
}
