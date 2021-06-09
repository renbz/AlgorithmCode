package R02_4月11号;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main09_3 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-->0){
            int a = in.nextInt();
            int b = in.nextInt();

            int t1 = 0;
            int t2 = 1;
            int ans = 2;
            for (int i = a+3; i <=b ; i++) {
                t1 = t2;
                t2 = ans;
                ans = t1+t2;
            }
            System.out.println(ans);
        }
    }

}
