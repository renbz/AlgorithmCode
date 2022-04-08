package 每日一题_2022_04月;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/8 00:02
 * @Description:
 */

public class R04_08_0429_N叉树的层序遍历 {

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) return new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            List<Integer> res = new ArrayList<>();
            int size = queue.size();
            while (size-- > 0) {
                Node poll = queue.poll();
                queue.addAll(poll.children);
                res.add(poll.val);
            }
            ans.add(res);
        }
        return ans;
    }


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

    ;

}
