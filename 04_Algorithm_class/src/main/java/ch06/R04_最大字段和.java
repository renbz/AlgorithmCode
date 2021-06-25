package ch06;

import java.util.Arrays;

/**
 * @author Ren
 */
public class R04_最大字段和 {
    static int len = 5;
    static int[] arr = arr(len);

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        int ans = getMaxSubSum(len);
        System.out.println("该数组的最大字段和为： " + ans);
    }

    static int getMaxSubSum(int n) {
        int sum = 0, tmp = 0;
        for (int i = 0; i < n; i++) {
            tmp = tmp > 0 ? tmp + arr[i] : arr[i];
            if (tmp > sum) sum = tmp;
        }
        return sum;
    }


    /**
     * 生成随机数组
     */
    static int[] arr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (Math.random() > 0.6) {
                arr[i] = (int) (Math.random() * -15);
            } else {
                arr[i] = (int) (Math.random() * 20);
            }
        }
        return arr;
    }
}
