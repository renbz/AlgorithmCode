package 奇安信;

import java.util.Arrays;

/**
 * @author Ren
 */

public class Main01_最近真分数 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 得到最接近的真分数
     * @param a float浮点型 (0.01,0.99)区间内的一个小数
     * @return int整型一维数组
     */
    public int[] getFraction (float a) {
        // write code here
        double t1 = 1.0/a;
        int t2 = (int)(t1*200); //分母
        int t3 = 200;   //分子
        //求其最大公约数
        int gcd = gcd(t2,t3);


        return new int[]{t3/gcd,t2/gcd};

    }

    int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }

    public static void main(String[] args) {
        Main01_最近真分数 obj = new Main01_最近真分数();
        int [] aa = obj.getFraction((float) 0.333333333);
        System.out.println(Arrays.toString(aa));
        System.out.println(1.0/0.333333333);

    }


}
