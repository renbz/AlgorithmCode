package 每日一题_2021_9月;

/**
 * @author Ren
 */

import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double d = in.nextDouble();
        String format = new DecimalFormat("#.000").format(d);
        System.out.println(d >= 1 ? format : "0" + format);
    }
}
