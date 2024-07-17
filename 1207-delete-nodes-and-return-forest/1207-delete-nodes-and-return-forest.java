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
        Set<Integer> toDeleteSet = new HashSet<>();
        for (int val : to_delete) {
            toDeleteSet.add(val);
        }
        List<TreeNode> forest = new ArrayList<>();
        root = processNode(root, toDeleteSet, forest);
        // If the root is not deleted, add it to the forest
        if (root != null) {
            forest.add(root);
        }
        return forest;
    }
    private TreeNode processNode( TreeNode node, Set<Integer> toDeleteSet,List<TreeNode> forest){
        if (node == null) {
            return null;
        }
        node.left = processNode(node.left, toDeleteSet, forest);
        node.right = processNode(node.right, toDeleteSet, forest);
        // Node Evaluation: Check if the current node needs to be deleted
        if (toDeleteSet.contains(node.val)) {
            // If the node has left or right children, add them to the forest
            if (node.left != null) {
                forest.add(node.left);
            }
            if (node.right != null) {
                forest.add(node.right);
            }
            // Return null to its parent to delete the current node
            return null;
        }
        return node;
    }
}