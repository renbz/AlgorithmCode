package 每日一题_2021_12月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/29 09:20
 * @Description:
 */

public class R12_29_1995_统计特殊四元组2 {

    public int countQuadruplets(int[] nums) {
        int[] a = new int[101]; //两数相加
        int[] b = new int[101]; //三数相加
        int ans = 0;
        if (nums[0] + nums[1] <= 100) {
            a[nums[0] + nums[1]]++;
        }
        for (int i = 2; i < nums.length; i++) {
            if (i >= 3) {
                ans += b[nums[i]];
            }
            for (int j = 0; j < 101 - nums[i]; j++) {
                b[nums[i] + j] += a[j];
            }
            for (int j = 0; j < i; j++) {
                if (nums[j] + nums[i] < 101) a[nums[j] + nums[i]]++;
            }
        }
        return ans;
    }

}
