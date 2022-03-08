package 学习计划.高效制胜.Day07_树;

import java.util.concurrent.CountDownLatch;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/8 16:08
 * @Description:
 */

public class R0968_监控二叉树 {

    /**
     * 思路: 自底向上
     * 1. 递归到空结点返回0，不需要监控空结点
     * 2. 如果一个节点的两端都返回了0，此时它的下面没有摄像头所以返回2
     * 3. 如果左右节点的左右子树有一个返回2，就需要安装摄像头，此时count++，返回1，代表这里有摄像头
     * 4. 当一个节点的左右子树有一个返回1的，就代表下面有一个摄像头，已经监控完成 返回0
     * 5. 最后在主函数接受根节点的返回值，若返回2，则需要摄像头
     *
     * @param root
     * @return
     */
    int count = 0;

    public int minCameraCover(TreeNode root) {

        if (root.left == null && root.right == null) return 1;
        if (solve(root) == 2) count++;
        return count;
    }

    private int solve(TreeNode root) {
        if (root == null) return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        // 只要有2代表需要摄像头
        if (left == 2 || right == 2) {
            count++;
            return 1;
        }
        // 有1代表下面已经有一个摄像头
        if (left == 1 || right == 1) {
            return 0;
        }
        // 没有摄像头返回2
        return 2;
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
