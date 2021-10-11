package alphaacm009;

/**
 * @author Ren
 */
import java.util.*;
public class Main04_杨辉三角 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][] ans = new int[n][n];
        // 初始化数组 对角线和第一列都为1
        for (int i = 0; i < n; i++) {
            ans[i][i]=1;
            ans[i][0]=1;
        }
        // 元素等于左上方+上方
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
            }
        }
        //输出
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                // 判断结果长度,因为要求每个数的域宽为5
                for (int k = String.valueOf(ans[i][j]).length(); k <5 ; k++)
                    System.out.print(" ");
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}