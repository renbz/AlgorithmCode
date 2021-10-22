package 每日一题_2021_10月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren
 */

public class R10_22_0229_求众数II {
    public static void main(String[] args) {
        R10_22_0229_求众数II obj = new R10_22_0229_求众数II();
        List<Integer> list = obj.majorityElement(new int[]{4, 2, 1, 1});
        System.out.println(list);

    }
    /**
     * 使用摩尔投票法解题
     *
     * @param nums
     * @return
     */
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int cand1 = 0, count1 = 0;
        int cand2 = 0, count2 = 0;

        for (int num : nums) {
            if (cand1 == num) count1++;
            else if (cand2 == num) count2++;
            else if (count1 == 0) {
                cand1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                cand2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // 统计验证
        count1 = count2 = 0;
        for (int num : nums) {
            if (cand1 == num) {
                count1++;
            } else if (cand2 == num) {
                count2++;
            }
        }

        // 加入结果
        if (count1 > nums.length / 3) ans.add(cand1);
        if (count2 > nums.length / 3) ans.add(cand2);

        return ans;
    }
}
