package 每日一题_2022_02月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/27 15:19
 * @Description:
 */

public class R02_27_0553_最优除法 {

    public String optimalDivision(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return String.valueOf(nums[0]);
        }
        if (n == 2) {
            return String.valueOf(nums[0]) + "/" + String.valueOf(nums[1]);
        }
        StringBuffer res = new StringBuffer();
        res.append(nums[0]);
        res.append("/(");
        res.append(nums[1]);
        for (int i = 2; i < n; i++) {
            res.append("/");
            res.append(nums[i]);
        }
        res.append(")");
        return res.toString();
    }

}
