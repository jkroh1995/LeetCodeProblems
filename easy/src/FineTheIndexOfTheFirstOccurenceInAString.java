public class FineTheIndexOfTheFirstOccurenceInAString {
    public int strStr(String haystack, String needle) {
        int index = 0;
        while(haystack.length()>=needle.length()){
            if(haystack.startsWith(needle)){
                return index;
            }
            haystack = haystack.substring(1);
            index++;
        }
        return -1;
    }
}
