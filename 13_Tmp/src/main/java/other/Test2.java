package other;

/**
 * @author Ren
 */

import java.math.BigDecimal;
import java.util.*;

public class Test2 {


    public static BigDecimal moneyFen2Yuan(int fen) {
        return new BigDecimal(String.valueOf(fen)).divide(new BigDecimal("100"));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

            int amount = in.nextInt();
            StringBuilder amountBuild = new StringBuilder(String.valueOf(amount));
            StringBuilder ZERO = new StringBuilder();
            //判断amount的长度,是否大于3  然后补零插入小数点
            for (int i = amountBuild.length(); i < 3; i++) {
                ZERO=ZERO.append(0);
            }
            amountBuild = ZERO.append(amountBuild);
            String res = amountBuild.insert(amountBuild.length() - 2, '.').toString();
            System.out.println(res);
        }
    }
}
