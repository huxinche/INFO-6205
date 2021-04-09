package longestCommomPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int count = 0;
        while(count < first.length()){
            if (first.charAt(count) == last.charAt(count)){
                count++;
            }
            else{
                break;
            }
        }
        
        if(count==0){
            return "";
        }else{
            return first.substring(0,count);
        }
    }
}