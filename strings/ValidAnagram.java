package strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        char[] charArr = s.toCharArray();
        for (char c : charArr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if(map.get(c).equals(0)){
                return false;
            }
            map.put(c, map.get(c) - 1);

        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram( "aacc", "ccac"));
    }
}
