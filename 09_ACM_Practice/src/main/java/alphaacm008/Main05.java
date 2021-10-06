package alphaacm008;

/**
 * @author Ren
 */

import java.util.Scanner;
public class Main05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = n + 1; i >= 1; --i) {
            for (int j = 1; j <= i; ++j)
                System.out.print("* ");
            System.out.println();
        }
        for (int i = 2; i <= n + 1; ++i) {
            for (int j = 1; j <= i; ++j)
                System.out.print("* ");
            System.out.println();
        }
        return;
    }
}
