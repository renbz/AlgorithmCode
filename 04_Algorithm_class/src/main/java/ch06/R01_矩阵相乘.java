package ch06;

/**
 * @author Ren
 */

public class R01_矩阵相乘 {

    static int[] p = {30, 35, 15, 5, 10, 20};

    public static void main(String[] args) {

        // 矩阵数目
        int A = p.length -1 ;

        int dp[][] = new int[A + 1][A + 1];     // 存放相乘次数
        int s[][] = new int[A + 1][A + 1];     // 存放加括号的位置
        minCount(dp,s,A);
    }
    public static void minCount(int[][] dp, int[][] s, int A) {

        for (int r = 2; r <= A; r++) {    // r代表区间的右边界
            for (int i = 1; i <= A-r+1; i++) {   // i代表每次截断的位置
                int j = i + r - 1;
                dp[i][j] = dp[i+1][j] + p[i-1]*p[i]*p[j];
                s[i][j] = i;
                for (int k = i+1; k < j; k++) {
                    int t = dp[i][k] + dp[k+1][j] + p[i-1]*p[k]*p[j];
                    if(t < dp[i][j]){
                        dp[i][j] = t;
                        s[i][j] = k;
                    }
                }
            }
        }
        printArr(dp);
        System.out.println("\n矩阵连乘的最小运算次数为 : "+dp[1][A]);
    }

    // 打印数组
    public static void printArr(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
