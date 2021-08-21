package 京东集团; /**
 * @author Ren
 */

import java.util.Scanner;

public class Main02_2 {
    static int[][] a;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();

        //使用全局数组记录01个数
        a = new int[n][2];
        //初始化
        if (str.charAt(0) == '0') a[0][0] = 1;
        if (str.charAt(1) == '1') a[0][1] = 1;

        for (int i = 1; i < n; i++) {
            if (str.charAt(i) == '0') a[i][0] = a[i - 1][0] + 1;
            else a[i][1] = a[i - 1][1] + 1;
        }


        for (int i = 1; i <= n; i++) {
            String s = str.substring(0, i);
            if (s.length() == 1) System.out.println(1);
            else {
                System.out.print(f(s) + " ");
            }
        }
    }

    public static int f(String s) {
        int len = s.length();
        for (int i = 1; i <= s.length() / 2; i++) {
            if (len % i == 0) {
                //判断每i个区间的01数目是否相等
                boolean b = k(s, i);
                if (b) {
                    return len / i;
                } else {
                    continue;
                }
            }
        }
        return 1;
    }

    public static boolean k(String s, int k) {
        int len = s.length() / k;
        //对于第一段
        String s1 = s.substring(0, k);
        //统计0,1个数
        int c = 0;

        int k0 = a[k][0]-a[0][0];
        int k1 = a[k][1]-a[0][1];
        for (int i = 0; i < len-1; i++) {
            int ar0 = a[i*k+k][0];
            int al0 = a[i*k][0];
            int ar1 = a[i*k+k][1];
            int al1 = a[i*k][1];
            if(k0==ar0-al0 && k1== ar1-al1){
                c++;
            }
        }
        if(c==len) return true;
        return false;
    }
}
