package other;

/**
 * @author Ren
 */

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Keep2Deciaml {


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




    public static String moneyFen2YuanKeep2Decimal(int fen){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format((new BigDecimal(fen)).divide(new BigDecimal("100")));
    }

    public static String moneyFen2YuanKeep2Decimal2(int fen){
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return decimalFormat.format((new BigDecimal(fen)).divide(new BigDecimal("100")));
    }

    public static void main(String[] args) {
        System.out.println(moneyFen2YuanKeep2Decimal(0));
        System.out.println(moneyFen2YuanKeep2Decimal(10));
        System.out.println(moneyFen2YuanKeep2Decimal(111));
        System.out.println(moneyFen2YuanKeep2Decimal(1111));
        System.out.println("==============================================");
        System.out.println(moneyFen2YuanKeep2Decimal2(0));
        System.out.println(moneyFen2YuanKeep2Decimal2(10));
        System.out.println(moneyFen2YuanKeep2Decimal2(111));
        System.out.println(moneyFen2YuanKeep2Decimal2(1111));
    }
}
