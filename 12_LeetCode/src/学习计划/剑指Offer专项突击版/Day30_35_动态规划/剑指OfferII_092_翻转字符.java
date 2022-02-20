package 学习计划.剑指Offer专项突击版.Day30_35_动态规划;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/19 23:35
 * @Description:
 */

public class 剑指OfferII_092_翻转字符 {

    public int minFlipsMonoIncr(String s) {
        int one = 0, ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 当前等于0，看反转前面1为0  和  反转当前0为1的代价 哪个小
            if (c == '0') ans = Math.min(one, ans + 1);
            else one++;  // 记录前面1的个数
        }
        return ans;
    }
}
