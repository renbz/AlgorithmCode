package other;

/**
 * @author Ren
 */

/**
 * 先将集合A平分为两个集合P和Q，分别求出P,Q中的最大元素和第二大元素（称为p1, p2和q1, q2），
 * 然后通过这 4 个数字得到集合A的最大元素和第二大元素（称为max1和max2）
 */
public class R01_分治算法求第二大元素 {



    int[] max1_and_max2(int[] nums) {
        return divide_conquer(nums, 0, nums.length);
    }
    // 返回集合 A 在索引区间 [i, j) 的最大元素和第二大元素
    int[] divide_conquer(int[] A, int i, int j) {
        // base case
        if (j - i == 2) {
            if (A[i] < A[i + 1]) {
                return new int[]{A[i + 1], A[i]};
            } else {
                return new int[]{A[i], A[i + 1]};
            }
        }
        // 解决两个子问题
        int[] left = divide_conquer(A, i, (i + j) / 2);
        int[] right = divide_conquer(A, (i + j) / 2, j);

        int p1 = left[0], p2 = left[1];
        int q1 = right[0], q2 = right[1];
        // 通过子问题的结果合并原问题的答案
        int max1, max2;
        if (p1 > q1) {
            max1 = p1;
            max2 = Math.max(p2, q1);
        } else {
            max1 = q1;
            max2 = Math.max(q2, p1);
        }
        return new int[]{max1, max2};
    }

}
