package 天梯赛模拟赛;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        double c = (double)a/b*1.0;

        String r = String.format("%.1f",c);

        System.out.println(a+"/"+r+"="+b);

    }
}
