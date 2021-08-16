package 科大讯飞;

import java.util.HashMap;
import java.util.Set;

/**
 * @author Ren
 */

public class Main04 {


    public static void main(String[] args) {
        Main04 obj = new Main04();
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



    public int leafPairs(TreeNode root, int k) {
        Pair pair1 = dfs(root,k);
        Pair pair2 = dfs(root,k-1);
        return pair1.count-pair2.count;
    }

    private Pair dfs(TreeNode root, int k) {
        int [] depths = new int[k+1];
        boolean isLeft = root.left ==null && root.right==null;
        if(isLeft){
            depths[0]=1;
            return new Pair(depths,0);
        }

        int[] leftDepths = new int[k+1];
        int[] rightDepths = new int[k+1];
        int leftCount = 0,rightCount=0;
        if(root.right!=null){
            Pair rightPair = dfs(root.right,k);
            rightDepths = rightPair.depths;
            rightCount = rightPair.count;
        }
        for (int i = 0; i < k; i++) {
            depths[i+1] += leftDepths[i];
            depths[i+1] += rightDepths[i];
        }
        int cnt =0;
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j+i+2 <= k; j++) {
                cnt += leftDepths[i]*rightDepths[j];
            }
        }
        return new Pair(depths,cnt+leftCount+rightCount);

    }


    class Pair{
        int [] depths;
        int count;

        public Pair(int[] depths,int count){
            this.depths = depths;
            this.count = count;
        }
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
