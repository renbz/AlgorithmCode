package ch02;
import javax.xml.transform.Source;
import java.math.BigInteger;
import java.util.*;
/**
 * @author Ren
 */

public class R03_Fbnq {

    public static void main(String[] args) {
        System.out.println("请输入n,代表求第n项斐波那契数");
        Scanner in = new Scanner(System.in);
        BigInteger res = fbnq2(in.nextInt());
        System.out.println(res);
    }

    /**
     * 求第N项的斐波那契数列
     * @param n
     * @return
     */
    static long fbnq(int n){

        if(n==1) return 0;
        if(n==2) return 1;

        long preF = 0;
        long curF = 1;
        for (int i = 2; i <= n; i++) {
            curF = curF+preF;
            preF = curF-preF;
        }
        return curF;
    }


    static BigInteger fbnq2(int n){

        if(n==1) return BigInteger.ZERO;;
        if(n==2) return BigInteger.ONE;

        BigInteger preF = BigInteger.ZERO;
        BigInteger curF = BigInteger.ONE;
        BigInteger res = BigInteger.ZERO;
        for (int i = 2; i <= n; i++) {
            res = curF.add(preF);
            preF = curF;
            curF = res;

        }
        return res;
    }
}
