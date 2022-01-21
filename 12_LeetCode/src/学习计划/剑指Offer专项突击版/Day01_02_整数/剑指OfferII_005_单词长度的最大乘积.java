package 学习计划.剑指Offer专项突击版.Day01_02_整数;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/21 10:02
 * @Description:
 */

public class 剑指OfferII_005_单词长度的最大乘积 {

    public int maxProduct(String[] words) {
        int len = words.length, ans = 0;
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            for (char c : words[i].toCharArray()) {
                nums[i] |= 1<<(c-'a');
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if ((nums[i] & nums[j]) == 0) ans = Math.max(ans, words[i].length() * words[j].length());
            }
        }
        return ans;
    }

}
