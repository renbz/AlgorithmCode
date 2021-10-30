package alphaacm011;

/**
 * @author Ren
 */

import java.util.*;

public class Main09_数字反转 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.printf("%d%d%d", a % 10, a / 10 % 10, a / 100);
    }
}