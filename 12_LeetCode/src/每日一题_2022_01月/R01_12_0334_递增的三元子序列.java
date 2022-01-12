package 每日一题_2022_01月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/12 13:19
 * @Description:
 */

public class R01_12_0334_递增的三元子序列 {

    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= first) first = num;
            else if (num <= second) second = num;
            else return true;
        }
        return false;
    }

}
