public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        boolean isPrefix = true;
        String prefix = "";
        int index = 0;
        while(isPrefix){
            if(index>=strs[0].length()){
                break;
            }
            char standard = strs[0].charAt(index);
            for(String str : strs){
                if(index>=str.length()){
                    isPrefix = false;
                    break;
                }
                if(str.charAt(index)!=standard){
                    isPrefix = false;
                    break;
                }
            }

            if(isPrefix){
                prefix+=standard;
            }
            index++;
        }

        return prefix;
    }
}
