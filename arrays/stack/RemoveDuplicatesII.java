package arrays.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveDuplicatesII {
    public String removeDuplicates(String s, int k) {
    Deque<int[]> stack = new ArrayDeque<>();
    StringBuilder output = new StringBuilder();
    for (char c : s.toCharArray()) {
        if(stack.isEmpty() || stack.peek()[0] != c){
            stack.push(new int[]{(int)c , 1});
        }else {
            stack.peek()[1]++;
            if(stack.peek()[1] == k){
                stack.pop();
            }
        }
    }
    while(!stack.isEmpty()){
        int count = stack.peek()[1];
        char ch = (char)stack.pop()[0];
        for(int i = 0; i < count; i++){
            output.insert(0, ch);
        }
    }
    return output.toString();
    }
    public static void main(String[] args) {
        RemoveDuplicatesII solution = new RemoveDuplicatesII();
        System.out.println(solution.removeDuplicates("deeedbbcccbdaa", 3));
    }
}
