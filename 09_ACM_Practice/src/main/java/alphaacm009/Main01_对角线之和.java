package alphaacm009;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main01_对角线之和 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(arr[0][0] + arr[1][1] + arr[2][2] + arr[0][2] + arr[2][0]);
    }
}
