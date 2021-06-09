package AlphaACM.test002;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int s = 2*(a*b+a*c+b*c);
        int v = a*b*c;
        System.out.println(s);
        System.out.println(v);
    }
}
