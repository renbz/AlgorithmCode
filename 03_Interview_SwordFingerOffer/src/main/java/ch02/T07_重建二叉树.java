package ch02;

/**
 * @author Ren
 */

public class T07_重建二叉树 {

    public static void main(String[] args) {


    }

    static int[] preOrder = {1, 2, 4, 7, 3, 5, 6, 8};
    static int[] inOrder = {4, 7, 2, 1, 5, 3, 8, 6};

    public static TreeNode construct(int[] preOrder, int[] inOrder, int length) {
        if (preOrder == null || inOrder == null) {
            return null;
        }
        return constructCore(0, length - 1, 0, length - 1);
    }

    public static TreeNode constructCore(int startPreOrder, int endPreOrder, int startInOrder, int endInorder) {
        //前序遍历的第一个数字是根节点的值
        int rootValue = preOrder[0];
        TreeNode root = new TreeNode();
        root.value = rootValue;
        root.left = root.right = null;

        if (startPreOrder == endPreOrder) {
            if (startInOrder == endInorder && startPreOrder == startInOrder) {
                return root;
            } else {
                System.out.println("异常： Invalid input");
            }
        }

        //在中序遍历中找到根节点的值
        int rootInorder = startInOrder;
        while (rootInorder <= endInorder && rootInorder != rootValue) {
            ++rootInorder;
        }

        return root;
    }
}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

}
