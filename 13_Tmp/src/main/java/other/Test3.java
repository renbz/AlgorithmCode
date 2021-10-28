package other;

/**
 * @author Ren
 */

import java.math.BigDecimal;

public class Test3 {


    public static BigDecimal moneyFen2Yuan(int fen) {
        return new BigDecimal(String.valueOf(fen)).divide(new BigDecimal("100"));
    }

    public static String preAmountTransfer(int amountFen) {

        StringBuilder result = new StringBuilder();
        BigDecimal amountYuan = moneyFen2Yuan(amountFen);
        StringBuilder amountYuanBuild = new StringBuilder(String.valueOf(amountYuan));
        //判断是否包含小数点 和 小数点的位置
        if (amountYuanBuild.toString().indexOf('.') == -1) {
            result=amountYuanBuild.append(".00");
        } else if (amountYuanBuild.toString().indexOf('.') == String.valueOf(amountYuan).length() - 1) {
            result=amountYuanBuild.append("0");
        } else {
            result = amountYuanBuild;
        }
        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(preAmountTransfer(1));
        System.out.println(preAmountTransfer(11));
        System.out.println(preAmountTransfer(111));
        System.out.println(preAmountTransfer(1111));
        System.out.println(preAmountTransfer(100000));
    }
}
