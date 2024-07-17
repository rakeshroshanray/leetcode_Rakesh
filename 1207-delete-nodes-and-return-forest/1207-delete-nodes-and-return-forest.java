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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<to_delete.length; i++ ){
            set.add(to_delete[i]);
        }
        ArrayList <TreeNode> list = new ArrayList <>();
        helper(root,set,list,true);
        return list;
    }

    public TreeNode helper(TreeNode node, Set<Integer> set,ArrayList <TreeNode> list, boolean isRoot){

        if(node == null){
            return null;
        }
        boolean deleted = set.contains(node.val);
        if(isRoot && !deleted){
            list.add(node);
        }

        node.left = helper(node.left,set,list,deleted);
        node.right = helper(node.right,set,list,deleted);
        
        return deleted ? null: node;
    }
}