package 天梯赛国赛_2020;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();
        while (n2-- >0){
            String str = in.next();
            int res = 1;
            for (int i = 0; i < n1; i++) {
                if(str.charAt(i)=='y') res = res*2-1;
                else res = res*2;
            }
            System.out.println(res);
        }
    }
}
