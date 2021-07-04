package 剑指Offer;

/**
 * @author Ren
 */

public class R33_二叉搜索树的后序遍历序列 {

    /**
     *
     * @param postorder   给定的数组
     * @return  判断是否为二叉搜索树后序遍历的结果
     */
    public boolean verifyPostorder(int[] postorder) {

        int len  = postorder.length;
        if(len <= 1) return true;
        if(len ==2 && postorder[0]>postorder[1]) return true;
        for (int i = len-1; i >= 2; i--) {

        }
        return true;
    }

}
