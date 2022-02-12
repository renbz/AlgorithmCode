package 学习计划.剑指Offer专项突击版.Day23_24_二分查找;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/11 20:04
 * @Description:
 */

public class 剑指OfferII_070_排序数组中只出现一次的数字 {

    public int singleNonDuplicate(int[] nums) {
        int ans = 0;
        for (int num : nums) ans ^= num;
        return ans;
    }

}
