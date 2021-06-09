package R04_5月5号;

/**
 * @author Ren
 */

import java.util.Scanner;
public class Main01_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-- >0){
            String str = in.next();
            str += " ";
            int count = 1;
            long res = 0;
            for (int i = 0; i < str.length()-1; i++) {
                if(str.charAt(i) == str.charAt(i+1)){
                    count++;
                }else{
                    res += sum(count);
                    count = 1;
                }
            }
            System.out.println(res);
        }
    }
    // 求1-n的和的方法
    public static long sum(int n){
        long s = 0;
        for (int i = 0; i <= n; i++) {
            s+=i;
        }
        return s;
    }
}
