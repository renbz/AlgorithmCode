package ch05;

/**
 * @author Ren
 */

import java.util.*;
public class R05_约瑟夫环 {

    static int[] arr;

    public static void main(String[] args) {

        int total = 40;
        int num = 7;
        int start = 2;
        arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = i + 1;
        }
        ysf(total, num, start);
    }

// 0 1 2 3 4 5 6 7 8
// 2 3 4 5 6 7 8 9
    /**
     * @param total 总人数
     * @param num   循环报数周期
     * @param start 从那个人开始报数
     */
    public static void ysf(int total, int num, int start) {
        flag:
        while (!check(arr)) {
            int k = start;
            for (int i = 0; i < total; i++) {
                if (arr[i] != 0) {
                    if (k == num) {
                        System.out.print(arr[i]+"\t");
                        arr[i] = 0;
                        k = 0;
                    }
                    k++;
                }
                if (i == arr.length - 1) {
                    start = k;
                    continue flag;
                }
            }
        }
    }
    /**
     * 判断数组中是否全为零
     *
     * @param arr
     * @return
     */
    private static boolean check(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }
        return count == 0 ? true : false;
    }
}