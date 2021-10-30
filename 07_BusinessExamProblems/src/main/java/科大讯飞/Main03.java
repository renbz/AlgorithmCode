package 科大讯飞;

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.Set;

/**
 * @author Ren
 */

public class Main03 {


    public static void main(String[] args) {
        Main03 obj = new Main03();
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        root.left = left;
        root.right = right;

        int ans = obj.leafPairs(root, 3);
        System.out.println(ans);
    }



    int num = 0, k = 0;
    public int leafPairs(TreeNode root, int k) {
        this.k = k;
        getNodeHeight(root);
        return num;
    }
    private HashMap<Integer, Integer> getNodeHeight(TreeNode node) {
        if (node == null) return new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> left_map = getNodeHeight(node.left);
        HashMap<Integer, Integer> right_map = getNodeHeight(node.right);
        Set<Integer> left_set = left_map.keySet();
        Set<Integer> right_set = right_map.keySet();

        for (int left : left_set) {
            for (int right : right_set) {
                if (left + right + 2 == k) {
                    int left_size = left_map.get(left);
                    int right_size = right_map.get(right);
                    num += (left_size*right_size);// ---
                }
            }
        }
        HashMap<Integer, Integer> cur = new HashMap<>();
        for (int left : left_set) {
            if (left + 2 != k ) continue;
            int cur_num = cur.getOrDefault(left + 1, 0);
            cur.put(left + 1, cur_num + left_map.get(left));
        }
        for (int right : right_set) {
            if (right + 2 != k) continue;
            int cur_num = cur.getOrDefault(right + 1, 0);
            cur.put(right + 1, cur_num + left_map.get(right));
        }
        if (node.left == null && node.right == null) {
            cur.put(0, 1);
        }
        return cur;
    }


    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

}
