package R03_树;

/**
 * @author Ren
 */

public class R005_计算二叉树深度 {
    public static void main(String[] args) {

    }
    Node root = null;

    public int getBitreeDept(){
        return getBitreeDept(root);
    }

    private int getBitreeDept(Node n) {
        int leftHeight,rightHeight,maxHeight;
        if(n!=null){
            //计算左子树深度并赋值给leftHeight
            leftHeight = getBitreeDept(n.leftChild);
            //计算右子树深度并赋值给rightHeight
            rightHeight = getBitreeDept(n.rightChild);
            // 比较左右子树的深度 并返回结果，+1是因为要算上根节点
            return (leftHeight>rightHeight?leftHeight:rightHeight)+1;
        }else {
            return 0;
        }
    }
}
