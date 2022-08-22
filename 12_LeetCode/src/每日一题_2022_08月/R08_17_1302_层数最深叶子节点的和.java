package 每日一题_2022_08月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/8/22 22:52
 * @Description:
 */

public class R08_17_1302_层数最深叶子节点的和 {

    int maxLevel = -1;
    int sum = 0;

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    public void dfs(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (level > maxLevel) {
            maxLevel = level;
            sum = node.val;
        } else if (level == maxLevel) {
            sum += node.val;
        }
        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
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
