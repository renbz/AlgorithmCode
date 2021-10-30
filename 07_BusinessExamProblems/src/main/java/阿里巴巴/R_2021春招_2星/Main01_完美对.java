package 阿里巴巴.R_2021春招_2星;

/**
 * @author Ren
 */

import java.util.*;
public class Main01_完美对 {

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

        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                boolean f = true;
                for (int k = 0; k < m-1; k++) {
                    if(arr[i][k]+arr[j][k] != arr[i][k+1]+arr[j][k+1]){
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
