package 学习计划.编程能力.编程能力入门.Day12_类_对象;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/3 16:03
 * @Description:
 */

public class R303_区域和检索_数组不可变 {

    class NumArray {
        int[] nums_;

        public NumArray(int[] nums) {
            nums_ = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                nums_[i + 1] = nums_[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return nums_[right + 1] - nums_[left];
        }
    }

}
