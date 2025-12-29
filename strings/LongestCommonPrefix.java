package strings;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String preFix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(preFix)){
                preFix = preFix.substring(0, preFix.length() - 1);
                if(preFix.isEmpty()){
                    return "";
                }
            }
        }
        return preFix;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
