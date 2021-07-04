package 剑指Offer;

import java.util.Arrays;

/**
 * @author Ren
 *
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 *
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */

public class R07_重建二叉树 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if(preorder.length == 0 || inorder.length ==0){
            return null;
        }

        //在中序中寻找根节点
        int rootVal = preorder[0] , index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i]==rootVal){
                index = i;
                break;
            }
        }
        //创建根节点
        TreeNode root = new TreeNode(rootVal);
        //创建左子树
        root.left = buildTree(Arrays.copyOfRange(preorder,1,1+index),Arrays.copyOfRange(inorder,0,index));
        //创建右子树
        root.right = buildTree(Arrays.copyOfRange(preorder,1+index,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));
        return root;
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
