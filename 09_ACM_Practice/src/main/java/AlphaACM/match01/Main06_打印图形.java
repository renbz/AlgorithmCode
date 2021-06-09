package AlphaACM.match01;

/**
 * @author Ren
 */
import java.util.*;
public class Main06_打印图形 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {

            //打印空格
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            //打印X
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("X");
            }
            // 换行
            System.out.println();
        }
        //倒序打印
        for (int i = n-1; i >=1; i--) {
            //打印空格
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            //打印X
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("X");
            }
            // 换行
            System.out.println();
        }
    }
}
