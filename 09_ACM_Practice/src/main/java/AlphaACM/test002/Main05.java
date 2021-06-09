package AlphaACM.test002;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (1 + i) * i / 2;  // 等差数列求和
        }
        System.out.println(sum);
    }
}

