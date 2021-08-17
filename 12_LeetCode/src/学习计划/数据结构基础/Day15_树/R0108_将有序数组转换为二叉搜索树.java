package 学习计划.数据结构基础.Day15_树;

import java.util.Arrays;

/**
 * @author Ren
 */

public class R0108_将有序数组转换为二叉搜索树 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        if (nums.length == 1) return new TreeNode(nums[0]);
        int len = nums.length;
        int mid = nums[len / 2];
        int[] leftNums = Arrays.copyOfRange(nums, 0, len / 2);
        int[] rightNums = Arrays.copyOfRange(nums, len / 2 + 1, len);

        TreeNode root = new TreeNode(mid);
        root.left = sortedArrayToBST(leftNums);
        root.right = sortedArrayToBST(rightNums);
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
