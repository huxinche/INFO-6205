package wordLadder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
	public static void main(String[] args){
    	List<String> wordlist=new ArrayList<>();
    	wordlist.add("hot");
    	wordlist.add("dot");
    	wordlist.add("dog");
    	wordlist.add("lot");
    	wordlist.add("log");
    	wordlist.add("cog");
    	
    	System.out.println("Output: "+ladderLength("hit","cog",wordlist));
    	
    	}
	
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add(beginWord);
        set2.add(endWord);
        Set<String> ram = new HashSet<>(wordList);
        if(!ram.contains(endWord)) {
        	return 0;
        }
        return search(set1, set2, ram, true, 1);
    }
    
    private static int search(Set<String> beginSet, Set<String> endSet, Set<String> ram, boolean isForward, int count){
        if(beginSet.isEmpty() || endSet.isEmpty()) {
        	return 0;
        }
        count++;
        ram.removeAll(beginSet);
        Set<String> nextSet = new HashSet<>();
        for(String str : beginSet){
            char[] chs = str.toCharArray();
            for(int i = 0; i < chs.length; i++){
                char c = chs[i];
                for(char j = 'a'; j <= 'z'; j++){
                    chs[i] = j;
                    String tmp = new String(chs);
                    if(!ram.contains(tmp)) {
                    	continue;
                    }
                    if(endSet.contains(tmp)) {
                    	return count;
                    }
                    nextSet.add(tmp);
                }
                chs[i] = c;
            }
        }
        return nextSet.size() > endSet.size() ? search(endSet, nextSet, ram, false, count) : search(nextSet, endSet, ram, true, count);
    }
}