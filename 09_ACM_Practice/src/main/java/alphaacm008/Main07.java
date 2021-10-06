package alphaacm008;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(), sx = in.nextLong(), sy = in.nextLong();
        long ex = in.nextLong(), ey = in.nextLong();
        System.out.println(Math.max(Math.abs(sx - ex), Math.abs(sy - ey)));
    }
}
