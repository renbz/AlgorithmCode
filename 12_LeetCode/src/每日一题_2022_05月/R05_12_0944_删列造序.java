package 每日一题_2022_05月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/5/12 14:08
 * @Description:
 */

public class R05_12_0944_删列造序 {

    public int minDeletionSize(String[] strs) {
        int row = strs.length;
        int col = strs[0].length();
        int ans = 0;
        for (int j = 0; j < col; ++j) {
            for (int i = 1; i < row; ++i) {
                if (strs[i - 1].charAt(j) > strs[i].charAt(j)) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
