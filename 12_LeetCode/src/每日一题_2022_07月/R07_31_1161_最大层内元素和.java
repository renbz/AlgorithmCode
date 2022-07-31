package 每日一题_2022_07月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/7/31 14:41
 * @Description:
 */

public class R07_31_1161_最大层内元素和 {

    public int maxLevelSum(TreeNode root) {
        int ans = 1, maxSum = root.val;
        List<TreeNode> q = new ArrayList<>();
        q.add(root);
        for (int level = 1; !q.isEmpty(); level++) {
            List<TreeNode> nq = new ArrayList<>();
            int sum = 0;
            for (TreeNode node : q) {
                sum += node.val;
                if (node.left != null) nq.add(node.left);
                if (node.right != null) nq.add(node.right);
            }
            if (sum > maxSum) {
                maxSum = sum;
                ans = level;
            }
            q = nq;
        }
        return ans;
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
