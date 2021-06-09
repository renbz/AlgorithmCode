package ch06;

/**
 * @author Ren
 */
import java.util.Scanner;
public class R03_01Package{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   // 物品数量 - n
        int v = in.nextInt();   // 背包体积 - v
        int []arrv = new int [n+1];
        int []arrw = new int [n+1];
        for(int i=1;i<=n;i++) {
            arrv[i]=in.nextInt();   // 第i件物品的体积 - v
            arrw[i]=in.nextInt();   // 第i件物品的价值 - w
        }
        int [][] re = new int [n+1][v+1];
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=v;j++) {
                // not select i goods
                re[i][j]=re[i-1][j];
                // select i goods
                if(j>=arrv[i]) {
                    re[i][j]=Math.max(re[i-1][j-arrv[i]]+arrw[i],re[i][j] );
                }
            }
        }
        System.out.println(re[n][v]);   // 得出背包内的最大价值
    }
}