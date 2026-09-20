/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(p==root || q==root) return root;
        boolean pLiesInLeft = exists(root.left,p);
        boolean qLiesInLeft = exists(root.left,q);
        if(!pLiesInLeft && !qLiesInLeft){
           return lowestCommonAncestor(root.right,p,q);
        }
        else if(pLiesInLeft && qLiesInLeft){
            return lowestCommonAncestor(root.left,p,q);
        }
        return root;
        
    }
    public static boolean exists(TreeNode root,TreeNode node){
        if(root==null) return false;
        if(node==root){
            return true;
        }
        return exists(root.left,node) || exists(root.right,node);
    }
}