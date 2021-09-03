package 网易互联网;

/**
 * @author Ren
 */

public class R02_判断一颗二叉树是否是另一棵二叉树的子树 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        return recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    public boolean recur(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null || A.val != B.val) return false;
        return recur(A.left, B.left) && recur(A.right, B.right);
    }

    boolean search(TreeNode rootA, TreeNode rootB) {
        if (rootA == null || rootB == null) return false;
        return isTrue(rootA, rootB) || search(rootA.left, rootB) || search(rootA.right, rootB);
    }

    boolean isTrue(TreeNode rootA, TreeNode rootB) {
        if (rootB == null) return true;
        if (rootA == null || rootA.val != rootB.val) return false;
        return recur(rootA.left, rootB.left) && recur(rootA.right, rootB.right);
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
    }
}
