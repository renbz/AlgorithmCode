package AlphaACM.test001;

/**
 * @author Ren
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.print(new DecimalFormat("#0.000").format(a/b));
    }
}
