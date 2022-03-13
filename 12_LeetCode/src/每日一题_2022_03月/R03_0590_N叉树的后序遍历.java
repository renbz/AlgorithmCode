package 每日一题_2022_03月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/12 09:57
 * @Description:
 */

public class R03_0590_N叉树的后序遍历 {


    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    List<Integer> ans =new ArrayList<>();
    public List<Integer> postorder(Node root) {
        helper(root);
        return ans;
    }

    public void helper(Node root){
        if(root==null) return;
        for (Node child : root.children) {
            helper(child);
        }
        ans.add(root.val);
    }

}
