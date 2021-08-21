package 京东集团; /**
 * @author Ren
 */

import java.util.*;

public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i!=j && arr[i][0] - arr[j][0] == arr[i][1] - arr[j][1]) count++;
            }
        }
        System.out.println(count / 2);
    }

}
