package 京东集团; /**
 * @author Ren
 */

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        for (int i = 1; i <= n; i++) {
            String s = str.substring(0,i);
            if(s.length()==1) System.out.println(1);
            else{
                System.out.print(f(s)+" ");;
            }
        }
    }

    public static int f(String s){
        int len = s.length();
        for (int i = 1; i <= s.length() / 2; i++) {
            if(len%i==0){
                //判断每i个区间的01数目是否相等
                boolean b = k(s,i);
                if(b){
                    return len/i;
                }else{
                    continue;
                }
            }
        }
        return 1;
    }
    public static boolean k(String s,int k){
        int len = s.length()/k;
        //对于第一段
        String s1 = s.substring(0,k);
        //统计0,1个数
        int c0 =0,c1=0;
        for (int i = 0; i < k; i++) {
            if(s1.charAt(i)=='0') c0++;
            if(s1.charAt(i)=='1') c1++;
        }
        int c=0;
        for (int i = 0; i < len; i++) {
            if(kk(s.substring(k*i,k*i+k),k,c0,c1)) {
                c++;
            }
        }
        if(c==len) return true;
        return false;
    }
    public static boolean kk(String s1,int k,int c00,int c11){
        int c0 =0,c1=0;
        for (int i = 0; i < k; i++) {
            if(s1.charAt(i)=='0') c0++;
            if(s1.charAt(i)=='1') c1++;
        }
        if(c00==c0 && c11==c1) return true;
        return false;
    }

}
