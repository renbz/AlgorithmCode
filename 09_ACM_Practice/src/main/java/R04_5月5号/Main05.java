package R04_5月5号;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-- >0){
            int a = in.nextInt();
            int b = in.nextInt();
            if(a%b==0){
                System.out.println(0);
            }else{
                System.out.println(1);
            }
        }
    }
}

