package 网易互联网.网易传媒;

/**
 * @author Ren
 */

import java.util.*;
public class Main01_整除 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = String.valueOf(n);
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            String s = str.charAt(i)+"" ;
            int t = Integer.valueOf(s);
            if(t==0) continue;
            if(n%t==0){
                ans++;
            }
        }
        System.out.println(ans);
    }

}
