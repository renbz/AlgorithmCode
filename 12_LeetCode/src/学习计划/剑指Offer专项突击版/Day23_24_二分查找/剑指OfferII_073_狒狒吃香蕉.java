package 学习计划.剑指Offer专项突击版.Day23_24_二分查找;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/13 15:46
 * @Description:
 */

public class 剑指OfferII_073_狒狒吃香蕉 {

    public int minEatingSpeed(int[] piles, int H) {
        int lo = 1;
        int hi = 1_000_000_000;
        while (lo < hi) {
            int mi = (lo + hi) / 2;
            if (!possible(piles, H, mi))
                lo = mi + 1;
            else
                hi = mi;
        }

        return lo;
    }

    // Can Koko eat all bananas in H hours with eating speed K?
    public boolean possible(int[] piles, int H, int K) {
        int time = 0;
        for (int p : piles)
            time += (p - 1) / K + 1;
        return time <= H;
    }

}
