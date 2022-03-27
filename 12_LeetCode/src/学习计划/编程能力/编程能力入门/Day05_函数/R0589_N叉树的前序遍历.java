package 学习计划.编程能力.编程能力入门.Day05_函数;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/27 14:14
 * @Description:
 */

public class R0589_N叉树的前序遍历 {

    List<Integer> ans = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        dfs(root);
        return ans;
    }

    private void dfs(Node root) {
        if (root == null) return;
        ans.add(root.val);
        List<Node> children = root.children;
        for (Node child : children) {
            dfs(child);
        }
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
