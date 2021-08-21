package 网易互联网;

/**
 * @author Ren
 */

public class Main04_3 {


    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         * <p>
         * 计算最小航行费用
         *
         * @param input int整型二维数组 二维网格
         * @return int整型
         */
        public int minSailCost(int[][] input) {
            return dfs(input, input.length - 1, input[0].length - 1);
        }

        public int dfs(int[][] input, int i, int j) {
            if (i < 0 || j < 0) return 0;
            int t = 0;
            if (input[i][j] == 0) t = 2;
            if (input[i][j] == 1) t = 1;
            if (input[i][j] == 2) t = 99999;
            int a = 99999, b = 99999;
            if (i - 1 >= 0) a = dfs(input, i - 1, j);
            if (j - 1 >= 0) b = dfs(input, i, j - 1);
            return t + a>b?a:b;
        }
    }
}
