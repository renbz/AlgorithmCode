package R03_树;

/**
 * @author Ren
 */

public class R003_二叉树DFS {

    public static void main(String[] args) {

    }

    private void preOrderTraverse(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.value);
        preOrderTraverse(node.leftChild);
        preOrderTraverse(node.rightChild);
    }

    private void inOrderTraverse(Node node){
        if(node == null){
            return;
        }
        preOrderTraverse(node.leftChild);
        System.out.println(node.value);
        preOrderTraverse(node.rightChild);
    }

    private void postOrderTraverse(Node node){
        if(node == null){
            return;
        }
        preOrderTraverse(node.leftChild);
        preOrderTraverse(node.rightChild);
        System.out.println(node.value);
    }

}
