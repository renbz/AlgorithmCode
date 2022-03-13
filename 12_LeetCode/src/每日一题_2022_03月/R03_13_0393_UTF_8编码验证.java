package 每日一题_2022_03月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/13 14:52
 * @Description:
 */

public class R03_13_0393_UTF_8编码验证 {

    /**
     * 从前往后处理每个data[i]，先统计data[i]从第7位开始往后有多少位连续的1，代表这是一个及字节的字符，记为 cnt
     * - 如果cnt为1或者大于4均违反编码规则(与字符长度为1时的编码规则和字符长度只能是1到4冲突)，返回false
     * - 如果位置i后面不足cnt-1 也返回false
     * - 否则检查下标范围为 [i+1,i+cnt-1] 的数是否满足前两位为10的要求，若不满足返回false
     *
     * 如果满足上述要求，调到下一个检查点进行检查，整个data都没有冲突返回 True
     *
     * @param data
     * @return
     */
    public boolean validUtf8(int[] data) {
        int n = data.length, i = 0;
        while (i < n) {
            int t = data[i], j = 7;
            while (j >= 0 && ((t >> j) & 1) == 1) j--;
            int cnt = 7 - j;
            if (cnt == 1 || cnt > 4) return false;
            if (i + cnt - 1 >= n) return false;
            for (int k = i + 1; k < i + cnt; k++) {
                if ((((data[k] >> 7) & 1) == 1) && (((data[k] >> 6) & 1) == 0)) continue;
                return false;
            }
            if (cnt == 0) i++;
            else i += cnt;
        }
        return true;
    }

}
