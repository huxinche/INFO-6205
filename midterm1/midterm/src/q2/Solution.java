package q2;

import java.util.ArrayList;
import java.util.List;

//Time complexity: O(n);
//Space complexity: O(n);

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(3);
		TreeNode node4=new TreeNode(4);
		TreeNode node5=new TreeNode(5);
		TreeNode node6=new TreeNode(6);
		TreeNode node7=new TreeNode(7);
		TreeNode node8=new TreeNode(8);
		TreeNode node9=new TreeNode(9);
		TreeNode node10=new TreeNode(10);
		TreeNode node11=new TreeNode(11);
		TreeNode node13=new TreeNode(13);
		TreeNode node14=new TreeNode(14);
		
		node1.left=node2;
		node1.right=node3;
		
		node2.left=node4;
		node2.right=node5;
		
		node3.left=node6;
		node3.right=node7;
		
		node4.left=node8;
		node4.right=node9;
		
		node5.left=node10;
		node5.right=node11;
		
		node6.left=node13;
		node7.right=node14;
		
		printPerimeter(node1);

	}
	
	public static void printPerimeter(TreeNode root) {
	        List<Integer> res = new ArrayList<>();
	        if (root == null) {
	        	return;
	        }
	        res.add(root.val);
	        
	        TreeNode cur = root.right;
	        while (cur!=null && (cur.right!=null || cur.left!=null)) {
	            res.add(cur.val);
	            
	            if(cur.right==null) {
	            	cur=cur.left;
	            }else {
	            	cur=cur.right;
	            }
	            
	        }
	         
	        dfs(res,root);
	        
	        List<Integer> lBound = new ArrayList<>();
	        cur = root.left;
	        while (cur!=null && (cur.left!=null || cur.right!=null)) { 
	            lBound.add(cur.val);
	            
	            if(cur.left==null) {
	            	cur=cur.right;
	            }else {
	            	cur=cur.left;
	            }
	            
	        }
	        int i=0;
	        while(i<lBound.size()) {
	        	int num=lBound.size()-1-i;
	        	res.add(lBound.get(num));
	        	i++;
	        }
	        
	        
	        System.out.println(res.toString());
	    }
	    
	    public static void dfs(List<Integer> list,TreeNode root) {
	        if (root == null) {
	        	return;
	        }
	        
	        if (root.left == null && root.right == null) {
	            list.add(root.val);
	        }
	        dfs(list,root.right);
	        dfs(list,root.left);
	    }
	    
	   

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    
    TreeNode(){
    	
    }
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val,TreeNode left, TreeNode right) {
        this.val = val;
        this.left=left;
        this.right=right;
    }
}
