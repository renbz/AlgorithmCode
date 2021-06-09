package java_2020_B;

/**
 * @author Ren
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Main007_八次求和_5 {
    public static BigInteger eight(int t){
        BigInteger m = BigInteger.valueOf(t);
        m=m.multiply(m);   // 2次方
        m = m.multiply(m); // 4次方
        m = m.multiply(m); // 8次方
        return m;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger mod = BigInteger.valueOf(123456789);
        BigInteger sum = BigInteger.ZERO;

        long startTime = System.currentTimeMillis();
        for(int i=1;i<=1000000;i=i+10000){
            for(int j=1;j<=i;j++){
                sum = sum.add(eight(i)).mod(mod);
            }
        }
        long endTime = System.currentTimeMillis();


        System.out.println("100条测试数据累计用时："+(endTime-startTime)+"ms");
    }
}