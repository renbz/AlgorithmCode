package questionAll;

/**
 * @author Ren
 */

public class R0342_4的幂 {

    public boolean isPowerOfFour(int n) {

        // 是4的幂必然是2的幂，故首先判断是否为2的幂
        // 2的x次幂 = 2的2n次幂 或 2的2n+1次幂，前者是为4的幂

        if( n>0?(n&(n-1))==0:false){
            return n%3==1;
        }
        return false;
    }

}
