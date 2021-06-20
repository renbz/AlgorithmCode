package ch04;

import java.util.Arrays;

/**
 * @author Ren
 */

public class R03_QuickSort {
    public static void main(String[] args) {
        int[] arr = arr(20);
        System.out.println("初始随机元素↓↓\n" + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("快速排序后↑↑");
    }

    /**
     * 快速排序
     *
     * @param r      数组
     * @param low    待排序数组的起始下标
     * @param height 待排序序列的最终下标
     */
    static void quickSort(int[] r, int low, int height) {
        int i, j, t;
        if (low < height) {
            i = low;    // i为左指针
            j = height; // j为右指针
            t = r[i];   // 选出的标志数 t
            do {
                // 当右端数据大于 标志数时，右指针左移  直到 r[j]<t
                while (r[j] > t && i < j) j--;
                if (i < j) {
                    r[i] = r[j]; //将扫描的右端的数据 放入空缺位置
                    i++;
                }
                // 当左端数据小于 标志数时，左指针右移  直到 r[j]>t
                while (r[i] < t && i < j) i++;
                if (i < j) {
                    r[j] = r[i];
                    j--;
                }
            } while (i != j);
            // 此时 空缺位置 即 第i位 左边的数都小于t  右边的数都大于t，故将t放入
            r[i] = t;
            System.out.println(Arrays.toString(r));
            /**
             * 递归执行 标志位 左右两边的子数组
             */
            quickSort(r, low, i - 1);
            quickSort(r, i + 1, height);
        }
    }


    /**
     * 生成随机数组
     */
    static int[] arr(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
