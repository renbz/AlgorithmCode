package 学习计划.数据结构入门.Day03_数组;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/15 14:39
 * @Description:
 */

public class R0350_两个数组的交集 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int index = 0, index1 = 0, index2 = 0, len1 = nums1.length, len2 = nums2.length;
        int[] ans = new int[Math.min(len1, len2)];
        while (index1 != len1 && index2 != len2) {
            if (nums1[index1] == nums2[index2]) {
                list.add(nums1[index1]);
                ans[index++] = nums1[index1];
                index1++;
                index2++;
            } else if (nums1[index1] < nums2[index2]) {
                index1++;
            } else {
                index2++;
            }
        }
        return Arrays.copyOfRange(ans, 0, index);
    }

}
