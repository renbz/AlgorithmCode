package java_2013_C;

/**
 * @author Ren
 */

import java.util.*;

public class Main007_核桃的数量 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int m = a*b/gcd(a,b);
        int ans = m*c/gcd(m,c);
        System.out.println(ans);
    }
    //求出最大公约数
    static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }

}
