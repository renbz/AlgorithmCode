package alphaacm011;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main03_空心三角形 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (i > 1 && i < n - 1 && j > 0 && j < i) {
                        System.out.print("  ");
                    } else {
                        System.out.print(j == i ? "*" : "* ");
                    }
                }
                System.out.println();
            }
        }
    }
}
