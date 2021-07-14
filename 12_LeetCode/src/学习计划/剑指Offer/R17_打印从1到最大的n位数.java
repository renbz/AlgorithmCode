package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R17_打印从1到最大的n位数 {

    public int[] printNumbers(int n) {
        int res = 9;
        while (n-->1){
            res *= 10;
            res += 9;
        }
        int [] arr = new int[res];
        for (int i = 0; i < res; i++)   {
            arr[i] = i+1;
        }
        return arr;
    }

}
