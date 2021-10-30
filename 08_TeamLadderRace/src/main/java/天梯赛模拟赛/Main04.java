package 天梯赛模拟赛;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-->0){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            if(x*x+y*y+z*z==3*x*y*z){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
