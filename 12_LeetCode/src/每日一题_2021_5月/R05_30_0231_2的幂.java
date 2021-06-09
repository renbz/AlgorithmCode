package 每日一题_2021_5月;

/**
 * @author Ren
 */

public class R05_30_0231_2的幂 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(12));
    }

    public static boolean isPowerOfTwo(int n) {

        return n>0?(n&(n-1))==0:false;
    }

}
