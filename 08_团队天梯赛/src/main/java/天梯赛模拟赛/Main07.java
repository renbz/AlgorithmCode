package 天梯赛模拟赛;

/**
 * @author Ren
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Main07 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();



        int c =1;
        BigInteger bigInteger = bigint(c);


        while (!f(bigInteger,n)){
            bigInteger = bigint(c++);
        }


    }


    public static boolean f(BigInteger bigInteger,int n){
        if(bigInteger.mod(BigInteger.valueOf(n)).compareTo(BigInteger.ZERO)==0){
            System.out.println(bigInteger.divide(BigInteger.valueOf(n))+" "+bigInteger.toString().length());
            return true;
        }
        return false;
    }


    public static BigInteger bigint(int k){

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append("1");
        }

        return new BigInteger(sb.toString());
    }
}
