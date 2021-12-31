package 学习计划.力扣杯竞赛真题集.R2021春赛题集;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/30 12:52
 * @Description:
 */

public class LCP33_蓄水 {

    public int storeWater(int[] bucket, int[] vat) {
        int maxVat = 0;
        for (int v : vat) maxVat = Math.max(v, maxVat);
        if (maxVat == 0) return 0; //最大容量为0，代表不需蓄水，直接返回0
        int ans = 10001;
        for (int pour = 1; pour <= 10000; pour++) { //枚举倒水次数1-10000
            if (pour >= ans) break;
            int upgrade = 0;
            for (int i = 0; i < vat.length; i++) { //枚举每个水桶，计算总升级次数
                int cur = (int)Math.ceil((double)vat[i] / pour - bucket[i]); //容量/倒水次数-初始蓄水量=升级次数
                upgrade += cur > 0 ? cur : 0;
                if (upgrade >= ans) break;
            }
            ans = Math.min(ans, upgrade + pour); //倒水次数 + 总升级次数 = 总次数
        }
        return ans;
    }

}
