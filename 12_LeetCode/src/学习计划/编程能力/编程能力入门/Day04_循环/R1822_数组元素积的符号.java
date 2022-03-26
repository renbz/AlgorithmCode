package 学习计划.编程能力.编程能力入门.Day04_循环;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/26 23:20
 * @Description:
 */

public class R1822_数组元素积的符号 {

    public int arraySign(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) count++;
        }
        return ((count & 1) == 0) ? 1 : -1;
    }

}
