package 每日一题_2022_07月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/7/24 14:44
 * @Description:
 */

public class R07_24_1184_公交站间的距离 {

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        // 前缀和
        start = Math.min(start, destination);
        destination = Math.max(start, destination);
        int len = distance.length;
        int[] nums = new int[len + 1];
        for (int i = 1; i <= len; i++) {
            nums[i] = nums[i - 1] + distance[i - 1];
        }
        return Math.min(nums[destination] - nums[start - 1 < 0 ? 0 : start - 1], nums[len] - nums[destination - 1] + nums[start]);
    }

}
