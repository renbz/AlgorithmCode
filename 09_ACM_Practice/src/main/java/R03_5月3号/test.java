package R03_5月3号;

/**
 * @author Ren
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double d = in.nextDouble();

        String format = String.format("%.3f",d);
        System.out.println(format);



    }

}
