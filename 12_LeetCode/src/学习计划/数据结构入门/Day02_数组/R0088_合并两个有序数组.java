package 学习计划.数据结构入门.Day02_数组;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/13 12:35
 * @Description:
 */

public class R0088_合并两个有序数组 {
    public static void main(String[] args) {
        int [] a = new int[]{1,2,3,0,0,0};
        merge(a,3,new int[]{2,5,6},3);
        System.out.println(Arrays.toString(a));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        while (m != 0 && n != 0) {
            if (nums1[m - 1] > nums2[n-1]) {
                nums1[index--] = nums1[--m];
            } else {
                nums1[index--] = nums2[--n];
            }
        }
        while (n != 0) {
            nums1[index--] = nums2[--n];
        }
    }
}
