package R03_树;

/**
 * @author Ren
 */

public class R004_统计叶子节点个数 {
    public static void main(String[] args) {

    }
    Node root = null;
    public int getLeavesCount(){
        return getLeavesCount(root);
    }
    private int getLeavesCount(Node n){
        int leftLeavesCount;
        int rightLeavesCount;
        if(n==null){
            return 0;      // n为null，则一定不存在叶子节点，返回0.
        }else if(n.leftChild==null && n.rightChild==null){
            return 1;      // 节点n为叶子节点 返回1
        }else{
            //计算根节点左子树中叶子节点的数目
            leftLeavesCount = getLeavesCount(n.leftChild);
            //计算根节点右子树中叶子节点数目
            rightLeavesCount = getLeavesCount(n.rightChild);
            //返回左右子树叶子节点数目之和
            return leftLeavesCount+rightLeavesCount;
        }
    }
}
