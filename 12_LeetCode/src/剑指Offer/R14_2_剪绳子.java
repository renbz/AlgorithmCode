package 剑指Offer;

/**
 * @author Ren
 */

public class R14_2_剪绳子 {
    public long cuttingRope(int n) {
        if(n <= 3)
            return n-1;
        long res = 1;
        while(n > 4){
            res *= 3;
            res = res % 1000000007;
            n -= 3;
        }
        return (int)(res * n % 1000000007);
    }

}
