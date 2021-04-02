package q3;

//Time complexity: O(n);
//Space complexity: O(1);

class Solution{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[] {0,1,0,1,1,0,1,1,1,0,0,0};
		System.out.println(getMaxConsecutiveOnes(array));

	}
	public static int getMaxConsecutiveOnes(int[] nums) {
		int maxNum = 0;
		int maximum = 0;
        for (int i=0;i<nums.length;i++) {
        	maximum = Math.max(maximum, maxNum = nums[i] == 0 ? 0 : maxNum + 1);
        }
        
        return maximum; 
	}
}
