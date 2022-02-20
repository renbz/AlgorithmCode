package 每日一题_2022_02月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/20 00:19
 * @Description:
 */

public class R02_20_0717_1比特与2比特字符 {

    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length, i = 0;
        while (i < n - 1) {
            i += bits[i] + 1;
        }
        return i == n - 1;
    }

}
