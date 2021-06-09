package 天梯赛国赛_2020;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int t = k;
        double sum2 = 0.0;
        while (k-- >0){
            sum2 = sum2 + 1.0/in.nextDouble() ;

        }
        sum2 /= t*1.0;
        sum2 = 1.0/sum2;
        String res = String.format("%.2f",sum2);

        System.out.println(res);

    }
}
