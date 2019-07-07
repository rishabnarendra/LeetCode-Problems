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
    
    public List<Integer> list; 
    
    public Solution() {list = new ArrayList<Integer>();}
    
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null) {
            list.add(root.val); 
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return list; 
    }
}