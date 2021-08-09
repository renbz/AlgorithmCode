package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R53_2_0_n中缺失的数字 {
    public int missingNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) ans ^= nums[i];
        for (int i = 0; i < nums.length + 1; i++) ans ^= i;
        return ans;
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }


}
