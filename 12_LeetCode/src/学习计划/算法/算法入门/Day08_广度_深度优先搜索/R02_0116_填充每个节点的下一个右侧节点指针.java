package 学习计划.算法.算法入门.Day08_广度_深度优先搜索;

/**
 * @author Ren
 */

public class R02_0116_填充每个节点的下一个右侧节点指针 {

    public Node connect(Node root) {
        if(root==null) return root;
        if(root.left!=null){
            root.left.next = root.right;
            root.right.next =  (root.next==null)?null:root.next.left;
            connect(root.left);
            connect(root.right);
        }
        return root;
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

}
