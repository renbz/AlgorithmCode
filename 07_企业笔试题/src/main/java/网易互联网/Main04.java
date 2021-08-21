package 网易互联网;

/**
 * @author Ren
 */

public class Main04 {


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
            // write code here
            int dp[][] = new int[input.length + 1][input[0].length];
            //初始化
            for (int i = 0; i < input.length; i++) {
                if (input[i][0] == 0) dp[i][0] = 2;
                if (input[i][0] == 1) dp[i][0] = 1;
                if (input[i][0] == 2) dp[i][0] = Integer.MAX_VALUE;
            }
            for (int i = 0; i < input[0].length; i++) {
                if (input[0][i] == 0) dp[0][i] = 2;
                if (input[0][i] == 1) dp[0][i] = 1;
                if (input[0][i] == 2) dp[0][i] = Integer.MAX_VALUE;
            }

            for (int i = 1; i < input.length; i++) {
                for (int j = 1; j < input[0].length; j++) {
                    if (input[i][j] == 0){
                        dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 2;
                    }
                    if (input[i][j] == 1) dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                    if (input[i][j] == 2) dp[i][j] = Integer.MAX_VALUE;

                }
            }
            return dp[input.length - 1][input[0].length - 1];

        }

    }

}
