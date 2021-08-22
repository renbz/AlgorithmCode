package 美团; /**
 * @author Ren
 */

import java.util.Scanner;
import java.util.Stack;

public class Main03_小美的数学题2 {


    static int P = 1000000007;
    static int flag = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str=str.replaceAll("\\(\\)", "2");
        int ans = 1;

        System.out.println(f(str,0));

    }
    public static int f(String str, int i){
        if(i==str.length()) return 1;
        if(str.charAt(i)=='2'){
            return 2*f(str,i+1);
        }
        if(str.charAt(i)=='('){
            return 1+f(str,i+1);
        }
        if(str.charAt(i)==')'){
            return f(str,i+1);
        }

        return 1;
    }
}
