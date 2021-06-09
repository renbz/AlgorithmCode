package math2021;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main02 {
    static int[] arr;
    HashMap map = new HashMap<String,Long>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   //元素个数
        arr = new int[n + 1];   // 存放元素的数组  从1开始
        for (int i = 1; i <= n; i++) arr[i] = in.nextInt();
        int q = in.nextInt();   // 测试数据组数
        while (q-- > 0) {
            int left = in.nextInt();
            int right = in.nextInt();
            long res = getMax(left, right);  // 获取指定区间的最大值(包含子区间)
            System.out.println(res);
        }
    }

    // 获取指定区间内最大值
    public static long getMax(int left, int right) {
        Long max = Long.MIN_VALUE;
        for (int i = left; i <= right; i++) {
            for (int j = i; j <= right; j++) {
                //int[] arr2 = Arrays.copyOfRange(arr, i, j + 1);
                //long partVale = getPartValue(arr2, arr2.length);  // 获取子区间的值
                long partVale;
                if(left==right){
                    partVale = arr[i]^arr[j];
                }else{
                    partVale = arr[i];
                }

                max = max > partVale ? max : partVale;           // 比较子区间的值，得出最大的一个
            }
        }
        return max;
    }

    // 计算指定区间 的子区间内的异或值
    public static long getPartValue(int[] arr2, int fast) {
        // 当 n = 1 时，  ans = a1
        if (fast == 1) return arr2[0];
        // 当n > 1时  递归计算
        int i = 0, j = fast - 1;
        while (i < j) {
            arr2[i] = arr2[i] ^ arr2[i + 1];  // 异或运算
            i++;
        }
        return getPartValue(arr2, fast - 1);
    }
}

