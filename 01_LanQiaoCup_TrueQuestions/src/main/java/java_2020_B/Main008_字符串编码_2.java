package java_2020_B;

/**
 * @author Ren
 */

import java.util.Scanner;
public class Main008_字符串编码_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] c = str.toCharArray();
        int i;
        for(i = 0; i < str.length()-1; i++) {
            int a = c[i]-'0';
            int b = c[i+1]-'0';
            int ans = a*10+b;
            if(ans<27) {
                char ch = (char) (ans+64);
                System.out.print(ch);
                i++;
            }else {
                char ch = (char) (a+64);
                System.out.print(ch);
            }
        }
        if(i < str.length()){
            char ch = (char) (c[i]-'0'+64);
            System.out.print(ch);
        }
    }
}