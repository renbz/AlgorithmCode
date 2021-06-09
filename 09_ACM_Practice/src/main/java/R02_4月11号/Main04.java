package R02_4月11号;

/**
 * @author Ren
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (true){
            int a   = in.nextInt();
            int b   = in.nextInt();
            if(a==0 && b==0) return;

            int[] arr = new int[b];
            for (int i = 0; i < b; i++) {
                arr[i]=in.nextInt();
            }

            Arrays.sort(arr);

            for (int i = b-1; i >=0 ; i--) {
                int t = arr[b-1]-arr[b-1-(b/2)];
                int ans = b/2+1-t;
            }
        }
    }

}
