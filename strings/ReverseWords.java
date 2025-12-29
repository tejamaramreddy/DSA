package strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static String reverseWords(String s) {
        if(s == null || s.trim().isEmpty()){
            return s;
        }
        String[] s1 = s.trim().split("\\s+");
        int left = 0;
        int right = s1.length - 1;
        while (left < right){
            String tmp = s1[left];
            s1[left] = s1[right];
            s1[right] = tmp;
            left++;
            right--;
        }

        return String.join(" ", s1);
    }
    public static void main(String[] args) {
        String s = "Java    is     very   fun";

        System.out.println(reverseWords(s));
        System.out.println(reverseWords(s).equals("fun very is Java"));

    }
}
