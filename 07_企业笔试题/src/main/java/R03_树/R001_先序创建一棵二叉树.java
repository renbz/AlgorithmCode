package R03_树;

import java.io.IOException;

/**
 * @author Ren
 */

public class R001_先序创建一棵二叉树 {

    public static void main(String[] args) {

    }

    private Node root = null;

    public void createBiTree() throws IOException {
        root = createBiTree(root);
    }

    Node createBiTree(Node n) throws IOException {
        char c = ' ';
        c = (char) System.in.read();
        if (c == ' ') {
            n = null;
        } else {
            n = new Node(c);
            n.leftChild = createBiTree(n.leftChild);
            n.rightChild = createBiTree(n.rightChild);
        }
        return n;
    }
}

