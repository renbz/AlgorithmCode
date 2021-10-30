package 阿里巴巴.R_2021春招_2星;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main01_完美对_优化后 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                arr[i][k] = in.nextInt();
            }
        }
        boolean [] b = new boolean[n];
        int res = 0;
        for (int i = 0; i < n-1; i++) {
            if(b[i]==true) continue;
            int count = 0;
            for (int j = i+1; j < n ; j++) {
                if(b[j]==true) continue;
                boolean f = true;
                for (int k = 0; k < m-1; k++) {
                    if(arr[i][k]+arr[j][k] != arr[i][k+1]+arr[j][k+1]){
                        f = false;
                        break;
                    }
                }
                if(f){
                    count++;
                    System.out.println(i+"  "+j);
                    b[j]=true;
                }
            }
            res += count*(count+1)/2;
        }
        System.out.println(res);


    }
}
