package 学习计划.剑指Offer;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/3 11:37
 * @Description:
 */

public class R43_1_n整数中1出现的次数 {

    public int countDigitOne(int n) {
        // 个位数  包含1个1
        // 十位数  包含1开头的 10+1个1   2-9开头 个包含1个  共 19个
        // 百位数  1开头    100+19  2-9开头  8*19  共271个
        // 千位数  1开头    1000+271    2-9开头  8*271

        //最高位 如果1开头 那么 非最高位的全部1的个数+1 为目标结果
        //否则   计算2-n/(10000的结果)

        return -1;
    }
}
