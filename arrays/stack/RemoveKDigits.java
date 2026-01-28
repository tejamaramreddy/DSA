package arrays.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();
        if(num.length() <= k){
            return "0";
        }
        for(char ch : num.toCharArray()){
            while(!stack.isEmpty() && k > 0 && stack.peekLast() > ch){
                stack.removeLast();
                k--;
            }
            stack.addLast(ch);
        }
        while(k>0 && !stack.isEmpty()){
            stack.removeLast();
            k--;
        }

        StringBuilder result = new StringBuilder();
        boolean leadingZero = true;

        for (char ch : stack) {
            if (leadingZero && ch == '0') {
                continue;
            }
            leadingZero = false;
            result.append(ch);
        }

        return result.length() == 0 ? "0" : result.toString();

    }

    public static void main(String[] args) {
        RemoveKDigits removeKDigits = new RemoveKDigits();
        System.out.println(removeKDigits.removeKdigits("23456789", 3));
    }
}
