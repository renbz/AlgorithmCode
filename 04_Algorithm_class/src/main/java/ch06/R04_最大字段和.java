package ch06;

import java.util.Arrays;

/**
 * @author Ren
 */
public class R04_最大字段和 {
    static int len = 15;
    static int[] arr = arr(15);

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        int ans = getMaxSubSum(15);
        System.out.println("该数组的最大字段和为： " + ans);
    }

    static int getMaxSubSum(int n) {
        int sum = 0, max = 0;
        for (int i = 0; i < n; i++) {
            max = max > 0 ? max + arr[i] : arr[i];
            if (max > sum) sum = max;
        }
        return max;
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
