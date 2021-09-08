package 学习计划.贝壳找房.day04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren
 */

public class R02_0113_路径总和II {

    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {


        return ans;
    }

    public void dfs(TreeNode root){

    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
