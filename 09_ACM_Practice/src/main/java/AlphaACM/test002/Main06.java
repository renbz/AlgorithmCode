package AlphaACM.test002;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main06 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 1 , b =1 ,c=1;
        for (int i = 3; i <= n ; i++) {
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}

