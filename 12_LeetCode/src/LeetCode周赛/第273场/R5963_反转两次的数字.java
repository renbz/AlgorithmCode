package LeetCode周赛.第273场;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/26 10:31
 * @Description:
 */

public class R5963_反转两次的数字 {

    public boolean isSameAfterReversals(int num) {
        String s = String.valueOf(num);
        StringBuilder builder = new StringBuilder(s);
        builder = builder.reverse();
        int num1 = Integer.parseInt(builder.toString());
        String s2 = String.valueOf(num1);
        StringBuilder builder2 = new StringBuilder(s2);
        builder2 = builder2.reverse();
        int num2 = Integer.parseInt(builder2.toString());
        return num == num2;
    }

}
