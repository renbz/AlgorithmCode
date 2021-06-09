package 剑指Offer;

/**
 * @author Ren
 */

public class R10_2_青蛙跳台阶问题 {

    public int numWays(int n) {
        if(n==0) return 1;
        if(n<=2) return n;

        int a=1,b=2,c=2;
        for (int i = 3; i <=n ; i++) {
            c=(a+b)%1000000007;
            a=b;
            b=c;
        }
        return c;
    }
}
