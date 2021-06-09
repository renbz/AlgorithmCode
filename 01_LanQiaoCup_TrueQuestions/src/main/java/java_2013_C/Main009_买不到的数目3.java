package java_2013_C;

/**
 * @author Ren
 */

import java.util.Scanner;

//记忆型递归
public class Main009_买不到的数目3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        boolean[] b = new boolean[m * n + 1];
        for (int i = 0; m * i <= m * n; i++) {
            for (int j = 0; m * i + n * j <= m * n; j++) {
                b[m * i + n * j] = true;
            }
        }
        for (int i = m * n; i >= 0; i--) {
            if (b[i] == false){
                System.out.println(i);
                System.exit(0);
            }
        }
    }
}
