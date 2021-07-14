package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R33_二叉搜索树的后序遍历序列 {

    /**
     * @param postorder 给定的数组
     * @return 判断是否为二叉搜索树后序遍历的结果
     */
    public boolean verifyPostorder(int[] postorder) {
        return dfs(postorder, 0, postorder.length-1);
    }

    //递归分治
    public boolean dfs(int[] postorder, int begin, int end) {
        if (begin >= end) return true;
        int leftRoot = begin;
        //寻找左子树的根节点,倒着找 找到第一个比根节点小的就是左子树
        while (postorder[leftRoot] < postorder[end]) leftRoot++;
        // 寻找右子树的根节点
        int right = leftRoot;
        while (postorder[right] > postorder[end]) right++;
        return right == end && dfs(postorder, begin, leftRoot - 1) && dfs(postorder, leftRoot, end - 1);
    }
}
