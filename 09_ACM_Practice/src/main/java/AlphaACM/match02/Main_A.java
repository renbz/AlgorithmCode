package AlphaACM.match02;

/**
 * @author Ren
 */

import java.util.*;

public class Main_A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 2; i <= n; i++)
            if (isPNums(i)) System.out.print(i + " ");
    }

    static boolean isPNums(int num) {
        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0) return false;
        return true;
    }
}
