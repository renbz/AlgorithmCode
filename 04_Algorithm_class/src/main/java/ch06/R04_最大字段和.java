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
        int sum = 0, max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum < 0) sum = 0;
            max = max > sum ? max : sum;
            max2 = max2 > arr[i] ? max2 : arr[i];
        }
        return max2 < 0 ? max2 : max;
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
