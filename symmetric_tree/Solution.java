package symmetric_tree;

// Given the root of a binary tree,
// check whether it is a mirror of itself (i.e., symmetric around its center).

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return false;

        return helper(root.left, root.right);
    }

    public boolean helper(TreeNode left, TreeNode right) {
        if(right == null && left == null)
            return true;

        if(left == null || right == null)
            return false;

        if(left.val != right.val)
            return false;

        return helper(left.left, right.right) && helper(left.right, right.left);
    }
}
