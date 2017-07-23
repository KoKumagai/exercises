/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {

    public int sumOfLeftLeaves(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int sumLeft = 0;

        if (root.left != null) {

            if (root.left.left == null && root.left.right == null) {
                sumLeft += root.left.val;
            } else {
                sumLeft += sumOfLeftLeaves(root.left);
            }

        }

        sumLeft += sumOfLeftLeaves(root.right);

        return sumLeft;

    }

}
