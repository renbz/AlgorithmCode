package java_2017_A;

/**
 * @author Ren
 */
import java.util.Scanner;
public class Main007_正则问题2 {
    //((xx|xxx)x|(x|xx))xx 6
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        s = in.next();
        n = s.length();
        System.out.println(f());
    }
    static String s;
    static int p=0;//记录指针
    static int n=0;//记录长度
    static int f() {
        int ans=0,temp=0;
        while(p<n) {
            if(s.charAt(p)=='(') {
                p++;
                temp+=f();
            } else if(s.charAt(p)=='x') {
                p++;
                temp++;
            } else if(s.charAt(p)=='|') {
                p++;
                ans = Math.max(ans, temp);
                temp=0;//结算清零，上面ans已经保存了temp的值了,如果有3|4|5 那么相当于3|4计算在ans里面了
            } else if(s.charAt(p)==')') {
                p++;
                return Math.max(ans, temp);
            }
        }
        return Math.max(ans, temp);
    }
}
