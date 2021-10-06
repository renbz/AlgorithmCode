package alphaacm008;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int Q = sc.nextInt();
        while (Q-- > 0) {
            int t = sc.nextInt();
            System.out.println(t % s == 0 ? 0 : (s - t % s));
        }
    }
}