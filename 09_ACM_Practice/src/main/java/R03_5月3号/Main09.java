package R03_5月3号;

/**
 * @author Ren
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int k = in.nextInt();

            double sum1 = 0;
            double sum2 = 0;
            for (int i = 0; i < k; i++) {
                double tmp = in.nextDouble();
                sum1 += tmp;
                BigDecimal b = new BigDecimal(tmp);
                double f1 = b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
                sum2 += f1;

            }

            BigDecimal res = new BigDecimal(sum2-sum1);
            double ans = res.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue(); ;
            String answ = ans+"000";
            int index = answ.indexOf('.');
            System.out.println(answ.substring(0,index+4));
        }
    }
}
