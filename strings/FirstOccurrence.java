package strings;

public class FirstOccurrence {
    public static int strStr(String haystack, String needle) {

        boolean contains = haystack.contains(needle);
        if(contains){
           return haystack.indexOf(needle);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }
}
