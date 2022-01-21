package 学习计划.剑指Offer专项突击版.Day01_02_整数;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/21 10:13
 * @Description:
 */

public class 剑指OfferII_006_排序数组中两个数字之和 {

    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            if (numbers[l] + numbers[r] == target) return new int[]{l, r};
            if (numbers[l] + numbers[r] < target) l++;
            else r--;
        }
        return null;
    }

}
