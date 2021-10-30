package 美团; /**
 * @author Ren
 */

import java.util.Scanner;
import java.util.Stack;

public class Main03_小美的数学题 {


    static int P = 1000000007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str.replaceAll("()", "2");
        int ans = 1;

        Stack<Integer> stack = new Stack<>();

        ans = ans * f(str,0);
        System.out.println(ans);

    }
    public static int f(String str, int i){
        if(i==str.length()-1) return 1;
        if (str.charAt(i)=='(') return  (1+f(str,i+1))%P;
        if (str.charAt(i)=='2')  return  2*f(str,i+1)%P;
        if (str.charAt(i)==')') return 1;
        return 1;
    }
}
