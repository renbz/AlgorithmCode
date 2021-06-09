package 每日一题_2021_6月;

import java.util.Arrays;

/**
 * @author Ren
 */

public class R06_01_1744_你能在你最喜欢的那天吃到你最喜欢的糖果吗 {

    public static void main(String[] args) {

        int [] a = {16,38,8,41,30,31,14,45,3,2,24,23,38,30,31,17,35,4,9,42,28,18,37,18,14,46,11,13,19,3,5,39,24,48,20,29,4,19,36,11,28,49,38,16,23,24,4,22,29,35,45,38,37,40,2,37,8,41,33,8,40,27,13,4,33,5,8,14,19,35,31,8,8};
        int[][] b = {{43, 1054, 49}} ;

        System.out.println(Arrays.toString(canEat(a, b)));

    }

    public static boolean[] canEat(int[] candiesCount, int[][] queries) {

        // 求出candiesCount的前缀和 数组
        long [] preSum = new long[candiesCount.length+1];
        boolean [] ans = new boolean[queries.length];
        for (int i = 0; i < candiesCount.length; i++) {
            preSum[i+1] = preSum[i] + candiesCount[i];
        }

        // quires
        // 在每天吃 不超过 x 颗糖果的前提下，你可以在第 y 天吃到第 z 类糖果
        for (int i = 0; i < queries.length; i++) {
            int z = queries[i][0];
            int y = queries[i][1];
            int x = queries[i][2];

            if(y+1<=preSum[z+1] && (y+1)>=preSum[z]/x){
                ans[i]=true;
            }
        }
        return ans;
    }
}

