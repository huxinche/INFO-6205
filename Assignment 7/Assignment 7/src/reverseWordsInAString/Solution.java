package reverseWordsInAString;

public class Solution {
	    public String reverseWords(String s) {
	        if(s==null||s.equals(" ")){
	            return " ";
	        }
	        
	        String[] words = s.trim().split(" +");
	        Collections.reverse(Arrays.asList(words));
	        return String.join(" ", words);
	    }

}

/*
 Hi Anjali,
 I wrote another solution and it passed some test but not all. I cannot
 find out why this solution is wrong. Could you please help me to check
 this out? Thank you.
 
 
 class Solution {
    public String reverseWords(String s) {

        if(s==null||s.equals(" ")){
            return " ";
        }

        StringBuilder res=new StringBuilder();
        String[] str=s.split("\\s+");
        if(str==null||str.length==0){
            return " ";
        }
        for(int i=str.length-1;i>0;i--){
            res.append(str[i]+" ");
        }
        res.append(str[0]);
        
        return res.toString();
    }
}
  
*/
