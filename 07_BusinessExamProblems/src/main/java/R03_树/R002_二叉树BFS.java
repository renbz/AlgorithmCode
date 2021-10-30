package R03_树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ren
 */

public class R002_二叉树BFS {

    public static void main(String[] args) {

    }
    Node root = null;

    public void layerTraverse(){
        if(root == null) return;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);                 // 根节点入队
        while(!queue.isEmpty()){
            Node n = queue.poll();       //取出队首节点
            System.out.println(n.value); //打印节点数据
            if(n.leftChild!=null){
                queue.add(n.leftChild);  //将节点n的左孩子节点的引用入队列
            }
            if(n.rightChild!=null){
                queue.add(n.rightChild);  //将节点n的右孩子节点引用入队列
            }
        }

    }
}
