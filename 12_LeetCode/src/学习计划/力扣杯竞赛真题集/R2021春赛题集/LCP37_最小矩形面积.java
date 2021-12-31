package 学习计划.力扣杯竞赛真题集.R2021春赛题集;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/30 12:56
 * @Description:
 */

public class LCP37_最小矩形面积 {

    public double minRecSize(int[][] lines) {

        float max_x = Float.MIN_VALUE;
        float max_y = Float.MIN_VALUE;
        float min_x = Float.MAX_VALUE;
        float min_y = Float.MAX_VALUE;
        if (lines.length <= 2) {
            return 0;
        }

        int[] minDic = new int[10000 + 1];
        int[] maxDic = new int[10000 + 1];
        Arrays.fill(minDic, Integer.MAX_VALUE);
        Arrays.fill(maxDic, Integer.MIN_VALUE);
        LinkedList<Integer> ks = new LinkedList<Integer>();

        for (int[] line : lines) {
            int k = line[0];
            int b = line[1];
            if (minDic[k] == Integer.MAX_VALUE) {
                ks.add(k);
            }
            minDic[k] = Math.min(minDic[k], b);
            maxDic[k] = Math.max(maxDic[k], b);

        }
        if (ks.size() == 1) {
            return 0;
        }
        Collections.sort(ks);
        for (int i = 1; i < ks.size(); i++) {
            int currentK = ks.get(i);
            int minCurrentB = minDic[currentK];
            int maxCurrentB = maxDic[currentK];
            int lastK = ks.get(i - 1);
            int minLastB = minDic[lastK];
            int maxLastB = maxDic[lastK];
            float diff_k = lastK - currentK;
            min_x = Math.min(min_x, (maxCurrentB - minLastB) / diff_k);
            max_x = Math.max(max_x, (minCurrentB - maxLastB) / diff_k);
            min_y = Math.min(min_y, (lastK * maxCurrentB - currentK * minLastB) / diff_k);
            max_y = Math.max(max_y, (lastK * minCurrentB - currentK * maxLastB) / diff_k);

        }
        return (max_x - min_x) * (max_y - min_y);
    }

}
