package 阿里巴巴.R_2021春招_2星;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main01_完美对_优化后2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];
        int[][] cha = new int[n][m-1];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                arr[i][k] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m-1; k++) {
                cha[i][k] = arr[i][k]-arr[i][k+1];
            }
        }

        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                boolean f = true;
                for (int k = 0; k < m-2; k++) {
                    if(cha[i][k] + cha[j][k+1] == 0){
                        f = false;
                        break;
                    }
                }
                if(f){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
