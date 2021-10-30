package alphaacm011;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main02_直角三角形 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println("*");
            }
        }
    }
}
