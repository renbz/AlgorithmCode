package 学习计划.算法基础.Day07_广度_深度优先搜索;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/12 10:44
 * @Description:
 */

public class R0572_另一棵树的子树 {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        return dfs(s, t);
    }

    public boolean dfs(TreeNode s, TreeNode t) {
        // s遍历完了
        if (s == null) return false;
        // s不为null  比较s和t  比较s.left和t   比较s.right 和 t
        return check(s, t) || dfs(s.left, t) || dfs(s.right, t);
    }

    public boolean check(TreeNode s, TreeNode t) {
        // s和t均为null遍历匹配完成
        if (s == null && t == null) return true;
        // s和t有一个null说明还有还有子节点  数值不同 均返回false
        if (s == null || t == null || s.val != t.val) return false;
        return check(s.left, t.left) && check(s.right, t.right);
    }
}

class TreeNode {
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