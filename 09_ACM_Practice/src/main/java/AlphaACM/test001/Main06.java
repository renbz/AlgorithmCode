package AlphaACM.test001;

import java.math.BigInteger;
import java.util.Scanner;


public class Main06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- >0){
            BigInteger bi1 = in.nextBigInteger();
            BigInteger bi2 = in.nextBigInteger();

            BigInteger t1 = bi1.add(bi2);
            BigInteger t2 = bi2.subtract(bi1).add(BigInteger.ONE);
            if(t1.mod(BigInteger.valueOf(3)).compareTo(BigInteger.ZERO)==0  ||
               t2.mod(BigInteger.valueOf(3)).compareTo(BigInteger.ZERO)==0  ){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        in.close();
    }
}