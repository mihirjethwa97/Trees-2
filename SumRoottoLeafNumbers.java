// Time Complexity : O(n)
// Space Complexity : O(1) with stack O(log n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    int sum = 0;
    private void rec(TreeNode root, String val){
        if(root == null) return;
        val = val+root.val;
        if(root.left == null && root.right == null){
            sum = sum + Integer.parseInt(val);
        }
        rec(root.left, val);
        rec(root.right, val);
    }
    public int sumNumbers(TreeNode root) {
        rec(root, "");
        return sum;
    }
}
