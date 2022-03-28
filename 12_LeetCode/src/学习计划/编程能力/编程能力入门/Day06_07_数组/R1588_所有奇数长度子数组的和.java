package 学习计划.编程能力.编程能力入门.Day06_07_数组;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/28 14:51
 * @Description:
 */

public class R1588_所有奇数长度子数组的和 {

    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int[] prefixSums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSums[i + 1] = prefixSums[i] + arr[i];
        }
        int sum = 0;
        for (int start = 0; start < n; start++) {
            for (int length = 1; start + length <= n; length += 2) {
                int end = start + length - 1;
                sum += prefixSums[end + 1] - prefixSums[start];
            }
        }
        return sum;
    }
}
