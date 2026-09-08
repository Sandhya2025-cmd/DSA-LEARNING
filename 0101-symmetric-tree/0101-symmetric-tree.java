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
    public boolean isSymmetric(TreeNode root) {
       TreeNode l=invertTree(root.left);
       return isSame(l,root.right);
    }
    public TreeNode invertTree(TreeNode root) {

        if(root == null){
            return null;
        }
        invertTree(root.right);
        invertTree(root.left);

        TreeNode temp = root.left;
        root.left=root.right;
        root.right=temp;
        return root;
    }
    public boolean isSame(TreeNode p, TreeNode q) {

       if(p==null && q==null) return true;
       if(p==null || q==null) return false;
       if(p.val!=q.val) return false;
       if(!isSame(p.left,q.left)) return false;
       if(!isSame(p.right,q.right)) return false;
       return true;
    }
}