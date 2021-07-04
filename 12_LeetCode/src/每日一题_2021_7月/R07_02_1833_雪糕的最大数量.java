package 每日一题_2021_7月;

import java.util.Arrays;

/**
 * @author Ren
 */

public class R07_02_1833_雪糕的最大数量 {

    /**
     *
     * @param costs  表示雪糕的定价
     * @param coins  现金数
     * @return   求出现有钱数所能购买的雪糕的最大数量
     */
    public int maxIceCream(int[] costs, int coins) {


        Arrays.sort(costs);
        int count = 0;
        for (int i = 0; i < costs.length; i++) {
            if(coins-costs[i]>=0){
                coins -= costs[i];
                count++;
            }else{
                break;
            }
        }
        return count;
    }

}
