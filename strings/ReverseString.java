package strings;

import java.util.Arrays;

public class ReverseString  {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length -1;
        while (left < right){
            char tmp = s[right];
            s[right] = s[left];
            s[left] = tmp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o','i'};
        reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }
}
