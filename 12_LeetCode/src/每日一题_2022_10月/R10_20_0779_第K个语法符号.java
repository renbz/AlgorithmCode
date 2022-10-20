package 每日一题_2022_10月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/10/20 21:21
 * @Description:
 */

public class R10_20_0779_第K个语法符号 {

    public int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (k & 1) ^ 1 ^ kthGrammar(n - 1, (k + 1) / 2);
    }

}
