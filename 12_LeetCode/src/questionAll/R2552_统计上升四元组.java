package questionAll;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2023/12/8 22:06
 * @Description:
 */

public class R2552_统计上升四元组 {


    // 只需从下标 [1,n-2] 范围内查找符合条件的 j,k;
    // 统计index<j & num<nums[k]的数量 countPreJ
    // 统计index>k & num>nums[j]的数量 countNextK
    // k,j 确定的情况下, count(jk四元组) = countPreJ * countNextK.

    public static long countQuadruplets(int[] nums) {
        long count = 0;
        int n = nums.length;


        for (int j = 1; j < n - 2; j++) {
            for (int k = j + 1; k < n - 1; k++) {
                if (nums[k] < nums[j]) {
                    long underNumKCount = countSmaller(nums, j, nums[k]);
                    long overNumJCount = countLarger(nums, k, nums[j]);
                    count += underNumKCount * overNumJCount;
                }

            }
        }
        return count;
    }

    /**
     * 统计index<j ; num<num[k] 的数量
     */
    private static long countSmaller(int[] nums, int j, int numK) {
        int count = 0;
        for (int i = 0; i < j; i++) {
            if (nums[i] < numK) {
                count++;
            }
        }
        return count;
    }

    /**
     * 统计index>k ; num>num[j] 的数量
     */
    private static long countLarger(int[] nums, int k, int numJ) {
        int count = 0;
        for (int i = k + 1; i < nums.length; i++) {
            if (nums[i] > numJ) {
                count++;
            }
        }
        return count;
    }

    public static long countQuadruplets2(int[] nums) {
        int n = nums.length;
        int[] cnt = new int[n]; // cnt[j]表示前序满足条件的三元组(i, j, k)的个数
        long as = 0L;
        for (int p = 1; p < n; p++) {
            int c = 0;
            for (int q = 0; q < p; q++) {
                if (nums[p] > nums[q]) {
                    as += cnt[q];  // // 计算合法四元组[ _, j(q), _, l(p)]的个数
                    c++; // 计算满足i(q)<k(p)且nums[i]<nums[k]的二元组(i=q, k=p)的个数
                } else {
                    // 计算满足i<j(q)<k(p)且nums[i]<nums[k]<nums[j]的三元组[_, j(q), k(p)]的个数
                    cnt[q] += c;
                }
            }
        }
        return as; 
    }
}
