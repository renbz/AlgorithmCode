package 学习计划.剑指Offer专项突击版.Day16_19_树;

import java.util.TreeSet;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/9 09:15
 * @Description:
 */

public class 剑指OfferII_057_值和下标之差都在给定的范围内 {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            // ceiling(E e) 方法返回在这个集合中大于或者等于给定元素的最小元素，如果不存在这样的元素,返回null.
            Long ceiling = set.ceiling((long) nums[i] - (long) t);
            if (ceiling != null && ceiling <= (long) nums[i] + (long) t) return true;
            set.add((long) nums[i]);
            if (i >= k) set.remove((long) nums[i - k]);
        }
        return false;
    }

}
