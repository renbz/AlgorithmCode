package 学习计划.剑指Offer专项突击版.Day16_Day19_树;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/5 17:55
 * @Description:
 */

public class 剑指OfferII_051_节点之和最大的路径 {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    public int maxGain(TreeNode node) {
        if (node == null) return 0;
        // 递归计算左右子节点的最大贡献值
        // 只有在最大贡献值大于0时，才会选取对应子节点
        int left = Math.max(maxGain(node.left), 0);
        int right = Math.max(maxGain(node.right), 0);
        // 节点的最大路径和取决于该节点的值与该节点的左右子节点的最大贡献值
        int priceNewPath = node.val + left + right;
        // 更新答案
        maxSum = Math.max(maxSum, priceNewPath);
        // 返回节点的最大贡献值
        return node.val + Math.max(left, right);
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
