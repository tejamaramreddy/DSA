package arrays.slidingwindow;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        StringBuilder t_sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            String temp = t_sb.toString();
            while (temp.contains(ch+"")){
                temp = temp.substring(1);
            }
            t_sb = new StringBuilder(temp);
            t_sb.append(ch);
            maxLen = Math.max(maxLen, t_sb.length());
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aaaab"));
    }
}
