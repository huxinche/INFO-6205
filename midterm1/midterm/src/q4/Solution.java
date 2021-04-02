package q4;

//Time complexity: O(log n);
//Space complexity: O(1);

public class Solution {

	public static void main(String[] args) {
		int[] nums=new int[] {2,4,4,4,6,7,7,7,8,9,9,9};
		System.out.println(getIndex(nums,7));

	}
	
	public static int getIndex(int[] nums, int x) {
		    int index = -1;
		    int start = 0;
		    int end = nums.length - 1;
		    
		    while(start <= end){
		        int middle = (start + end) / 2;
		        if(nums[middle] >= x){
		            end = middle - 1;
		        }else{
		            start = middle + 1;
		        }
		        if(nums[middle] == x) {
		        	index = middle;
		        }
		    }
		    return index;
	}

}
