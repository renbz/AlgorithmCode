package 每日一题_2022_01月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/20 09:14
 * @Description:
 */

public class R01_20_2029_石子游戏IX {

    /**
     * Alice先手  如果cnt[0]为偶数个,Alice选择一个数 Bob选择一个3*  Alice选择另一个3* 结果无影响
     * 如果cnt[0]为奇数个，则结果相反
     * 如果先选1 则选取顺序  1,1,2,1,2,1,2,1,2,1,2 ...
     * 如果先选2 则选取顺序  2,2,1,2,1,2,1,2,1,2,1 ...
     * 在cnt[0]为偶数时 cnt[1]>0 && cnt[2]>0 时，Alice可根据情况选择  1或 2 以定胜局
     * @param stones
     * @return
     */
    public boolean stoneGameIX(int[] stones) {
        int cnt[] = new int[3];
        for (int stone : stones) {
            cnt[stone % 3]++;
        }
        if (cnt[0] % 2 == 0) {
            return cnt[1] > 0 && cnt[2] > 0;
        }
        return Math.abs(cnt[1] - cnt[2]) > 2;
    }
}
