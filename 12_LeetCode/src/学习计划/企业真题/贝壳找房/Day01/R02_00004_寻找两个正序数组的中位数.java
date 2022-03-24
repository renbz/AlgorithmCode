package 学习计划.企业真题.贝壳找房.Day01;

/**
 * @author Ren
 */

public class R02_00004_寻找两个正序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        boolean isOne = len % 2 == 1;
        int mid = len / 2;

        if (isOne) {
            int i = 0, j = 0;
            while (i < nums1.length && j < nums2.length) {

                if (mid == 0) return Math.min(nums1[i], nums2[j]);
                if (nums1[i] <= nums2[j]) {
                    mid--;
                    i++;
                } else {
                    mid--;
                    j++;
                }
            }
            while (i < nums1.length) {
                if (mid == 0) return nums1[i];
                i++;
                mid--;
            }
            while (j < nums2.length) {
                if (mid == 0) return nums2[j];
                j++;
                mid--;
            }
            return -1;
        } else {
            mid = mid + 1;
            int i = 0, j = 0, t = 0;
            while (i < nums1.length && j < nums2.length) {
                mid--;
                if (mid == 0) return (Math.min(nums1[i], nums2[j]) + t) / 2.0;
                if (nums1[i] <= nums2[j]) {
                    t = nums1[i];
                    i++;
                } else {
                    t = nums2[j];
                    j++;
                }
            }
            while (i < nums1.length) {
                mid--;
                if (mid == 0) return (nums1[i] + t) / 2.0;
                t = nums1[i];
                i++;
            }
            while (j < nums2.length) {
                mid--;
                if (mid == 0) return (nums2[j] + t) / 2.0;
                t = nums2[j];
                j++;
            }
            return -1;
        }
    }

}
