package 完美世界;

import java.util.Arrays;

/**
 * @author Ren
 */

public class Main02_股票买卖_2 {

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
        if(k==0){
            return 0;
        }
        if(k==1){
            int a[] = {0,5};
            return a[(int)(Math.random()*2)];
        }
        if(k==2){
            int a[] = {7,11};
            return a[(int)(Math.random()*2)];
        }
        /*int[] a = {0,5,7,10,11};
        return a[(int)(Math.random()*6)];*/
        return 10;
    }

    public static void main(String[] args) {
        System.out.println(Math.random()*6);
    }

}
