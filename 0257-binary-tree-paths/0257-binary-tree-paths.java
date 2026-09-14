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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        String res = "";
        dfs(root,ans,res);
        return ans;
    }
    public static void dfs(TreeNode root,List<String> ans,String res){
       
        if(root == null){
            return;
        }
        
        if(root.left==null && root.right==null){
            res=res+String.valueOf(root.val);
            ans.add(res);
        }
        res=res+String.valueOf(root.val)+"->";
        dfs(root.left,ans,res);
        dfs(root.right,ans,res);
    }
}