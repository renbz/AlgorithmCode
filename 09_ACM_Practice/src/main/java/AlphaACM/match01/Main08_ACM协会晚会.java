package AlphaACM.match01;

/**
 * @author Ren
 */

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main08_ACM协会晚会 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        while (n-- >0){
            int a = in.nextInt();
            int b = in.nextInt();
            if(a<b){
                System.out.println("0");
            }else{

                // 求出(a-b)的阶乘
                BigInteger res1 = BigInteger.ONE;
                for (int i = 1; i <= a-b ; i++) {
                    res1 = res1.multiply(BigInteger.valueOf(i));
                }


                BigInteger res2 = BigInteger.ONE;
                for (int i = b+1; i <= a; i++) {
                    res2 = res2.multiply(BigInteger.valueOf(i));
                }

                System.out.println(res2.divide(res1));

            }
        }
    }
}
