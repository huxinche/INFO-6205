package courseSchedule;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args){
    	int[][] prerequisites= {{1,0},{0,1}};
    	
    	System.out.println("Output: "+canFinish(2, prerequisites));
    	
    	}
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses <= 0) {
        	return false;
        }
        	
        Queue<Integer> queue = new LinkedList<Integer>();
        int[] list = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++) {
        	list[prerequisites[i][0]]++;
        }
        for(int i = 0; i < numCourses; i++){
        	if(list[i] == 0){
        		queue.offer(i); 
        	}
        }
        
        while(!queue.isEmpty()){
        	int start = queue.poll();
        	for(int i = 0; i < prerequisites.length; i++){
        		if(start == prerequisites[i][1]){
        			if(--list[prerequisites[i][0]] == 0){
        				queue.offer(prerequisites[i][0]);
        			}
        		}
        	}
        }
        for(int i =0; i < numCourses; i++){
        	if(list[i] !=0) {
        		return false;
        	}
        }
        return true;
    }
}
