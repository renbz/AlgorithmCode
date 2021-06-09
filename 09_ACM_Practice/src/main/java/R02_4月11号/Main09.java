package R02_4月11号;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main09 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-->0){
            int a = in.nextInt();
            int b = in.nextInt();
            //int [] arr = new int[];
            int ans = f(a,b);
            System.out.println(ans);

        }
    }

    public static int f(int a,int b){
        if(b==a+1) return 1;
        if(b==a+2) return 2;
        return f(a,b-1)+f(a,b-2);
    }

}
