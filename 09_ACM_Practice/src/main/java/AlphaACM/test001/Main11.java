package AlphaACM.test001;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(f(in.nextInt()));
    }

    static int f(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        return f(n-1)+f(n-2);
    }
}
