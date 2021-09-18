package 网易互联网.网易传媒;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main03_算数 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long l = in.nextLong(), ans1 = 0, ans2 = 1;
        if(l==0){
            System.out.println(0);
            return;
        }
        while (l != 0) {
            if ((l & 1) == 1) ans1++;
            else ans2++;
            l = l >> 1;
        }

        System.out.println(Math.min(ans1, ans2));
    }
}
