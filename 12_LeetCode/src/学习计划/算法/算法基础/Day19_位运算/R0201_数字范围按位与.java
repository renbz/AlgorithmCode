package 学习计划.算法.算法基础.Day19_位运算;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/2 09:51
 * @Description:
 */

public class R0201_数字范围按位与 {

    public int rangeBitwiseAnd(int left, int right) {
        // 找到公共前缀
        int shift = 0;
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        return left <<= shift;
    }

}
