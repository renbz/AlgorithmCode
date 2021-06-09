package R03_5月3号;

/**
 * @author Ren
 */

import java.math.*;
import java.text.DecimalFormat;
import java.util.*;

public class Main09_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            long n = in.nextLong();
            BigDecimal[] a = new BigDecimal[5000];
            BigDecimal[] b = new BigDecimal[5000];
            for (int i = 1; i <= n; i++) {
                a[i] = in.nextBigDecimal();
                b[i] = a[i];
                a[i] = a[i].setScale(2, BigDecimal.ROUND_HALF_UP);//四舍五入为两位小数
            }
            DecimalFormat df = new DecimalFormat("0.000");
            BigDecimal ans = BigDecimal.valueOf(0);
            for (int i = 1; i <= n; i++) {
                ans = ans.add(a[i].subtract(b[i]));
            }
            System.out.println(df.format(ans));
            in.close();
        }

    }
}