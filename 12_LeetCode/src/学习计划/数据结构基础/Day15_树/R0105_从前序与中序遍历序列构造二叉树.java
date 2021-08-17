package 学习计划.数据结构基础.Day15_树;

import java.util.Arrays;

/**
 * @author Ren
 */

public class R0105_从前序与中序遍历序列构造二叉树 {

    public static void main(String[] args) {
        R0105_从前序与中序遍历序列构造二叉树 obj = new R0105_从前序与中序遍历序列构造二叉树();
        TreeNode node = obj.buildTree(new int[]{3,9,20,15,7},new int[]{9,3,15,20,7});


    }

    /**
     * @param preorder 前序遍历   根左右
     * @param inorder  中序遍历   左根右
     * @return
     */

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder == null || preorder.length == 0) return new TreeNode();
        int len = preorder.length;
        int rootValue = preorder[0];
        if (len == 1) return new TreeNode(rootValue);

        int preIndex = getIndex(preorder, rootValue);
        int[] leftPreorder = new int[]{}, rightPreorder = new int[]{};
        if (preIndex > 0) {
            leftPreorder = Arrays.copyOfRange(preorder, 0, preIndex);
        }
        if (len > preIndex + 1) {
            rightPreorder = Arrays.copyOfRange(preorder, preIndex + 1, len);
        }

        int[] leftInorder = Arrays.copyOfRange(inorder, 1, len - rightPreorder.length);
        int[] rightInorder = Arrays.copyOfRange(inorder, len - rightPreorder.length, len);

        TreeNode root = new TreeNode(rootValue);
        if (leftPreorder != null || rightPreorder.length > 0)
            root.left = buildTree(leftPreorder, leftInorder);
        if(leftInorder!=null || rightInorder.length>0)
            root.right = buildTree(rightPreorder, rightInorder);
        return root;
    }

    public int getIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
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
