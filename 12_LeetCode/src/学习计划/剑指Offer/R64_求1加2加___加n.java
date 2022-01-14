package 学习计划.剑指Offer;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/13 16:54
 * @Description:
 */

public class R64_求1加2加___加n {
    public int sumNums(int n) {
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
