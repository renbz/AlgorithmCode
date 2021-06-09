package 天梯赛校赛;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long k = in.nextInt();
        long ans = 0;

        while(k-->0){
            String a = in.next();
            String b = in.next();
            if(a.equals(b)){
                ans++;
            }
        }
        System.out.println(ans);

    }
}
