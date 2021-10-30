package 天梯赛练习题_L1;

/**
 * @author Ren
 */

import java.util.*;
public class Main002_打印沙漏 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        String s = in.next();

        //根据输入的沙粒  计算沙漏的一半(包含对称轴)有多少排
        int a = (int)Math.sqrt((sum+1)/2);
        // 非对称的a排沙粒 需要的沙粒总数
        int b = 2*a*a-1;
        // 总数-需要的沙粒数 为剩余的沙粒数
        int res = sum-b;
        print(a,s);
        System.out.println(res);

    }

    static void print(int a,String s){
        for (int i = 0; i < a; i++) {
            // 打印空格
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // 打印沙粒
            for (int j = 0; j < 2 * (a-i) -1; j++) {
                System.out.print(s);
            }
            //换行
            System.out.println();
        }

        for (int i = a-1; i >0; i--) {
            // 打印空格
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            // 打印沙粒
            for (int j = 0; j < 2 * (a-i+1)-1; j++) {
                System.out.print(s);
            }
            System.out.println();
        }

    }

}
