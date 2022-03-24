package 学习计划.编程能力.编程能力入门.Day01_基本数据类型;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/23 17:26
 * @Description:
 */

public class R1523_在区间范围内统计奇数数目 {

    public int countOdds(int low, int high) {
        if ((low & 1) == 0) low++;
        if ((high & 1) == 0) high--;
        return low > high ? 0 : (high - low) >> 1 + 1;
    }

}
