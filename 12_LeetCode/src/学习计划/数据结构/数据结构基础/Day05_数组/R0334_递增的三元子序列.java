package 学习计划.数据结构.数据结构基础.Day05_数组;

/**
 * @author Ren
 */

public class R0334_递增的三元子序列 {

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
