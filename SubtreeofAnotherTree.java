package Leetcode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
     if(s == null){
         return t == null;
     }
     
     if(s.val == t.val && compare(s,t) ){
         return true;
     }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    
    public boolean compare(TreeNode s, TreeNode t) {
        if(s == null){
            return t == null;
        }
        if(t == null || s.val != t.val){
            return false;
        }
        
        return compare(s.left, t.left) && compare(s.right, t.right);
    }
}
