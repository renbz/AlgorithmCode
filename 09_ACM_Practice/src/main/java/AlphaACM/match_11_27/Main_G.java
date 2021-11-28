package AlphaACM.match_11_27;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/11/28 11:23
 * @Description:
 */
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
public class Main_G {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            BigInteger ans = BigInteger.valueOf(1);
            for (int i = 1; i <= n; i++) ans = ans.multiply(BigInteger.valueOf(i));
            System.out.println(ans);
        }
    }
}
