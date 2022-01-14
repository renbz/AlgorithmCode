package 学习计划.剑指Offer;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/13 16:59
 * @Description:
 */

public class R65_不用加减乘除做加法 {

    public int add(int a, int b) {
        if (a == 0 || b == 0)
            return a ^ b;
        return add(a ^ b, (a & b) << 1);
    }

}
