package convert_sorted_array_to_binary_search_tree;

// Given an integer array nums where the elements are sorted in ascending order,
// convert it to a height-balanced binary search tree.

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;

        return binarySearchNewNode(0, nums.length - 1, nums);
    }

    public TreeNode binarySearchNewNode(int left, int right, int[] nums) {
        if(left > right)
            return null;

        int mid = (right + left) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = binarySearchNewNode(left, mid - 1, nums);
        node.right = binarySearchNewNode(mid + 1, right, nums);

        return node;
    }
}
