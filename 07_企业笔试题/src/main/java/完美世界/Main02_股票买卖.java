package 完美世界;

import java.util.Arrays;

/**
 * @author Ren
 */

public class Main02_股票买卖 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 传入交易次数k，每日价格prices[]，手续费fee。返回可获得最大利润值。
     * @param k int整型 允许交易最大次数
     * @param prices int整型一维数组 每日股票价格
     * @param fee int整型 每次交易手续费
     * @return int整型
     */
    public int maxProfit (int k, int[] prices, int fee) {
        // write code here

        if(prices.length==0) return 0;
        int n = prices.length;
        k =Math.min(k,n/2);
        int []buy = new int[k+1];
        int []sell = new int[k+1];

        buy[0] = -prices[0];
        sell[0] = 0;
        for (int i = 0; i <=k; i++) {
            buy[i]=sell[i]=Integer.MIN_VALUE/2;
        }

        for (int i = 0; i < n; i++) {
            buy[0] = Math.max(buy[0],sell[0]-prices[0]);
            for (int j = 0; j <= k; j++) {
                buy[j] = Math.max(buy[j],sell[j]-prices[j]);
                sell[j] = Math.max(sell[j],buy[j-1]+prices[i]);

            }
        }
        return Arrays.stream(sell).max().getAsInt();

    }

}
