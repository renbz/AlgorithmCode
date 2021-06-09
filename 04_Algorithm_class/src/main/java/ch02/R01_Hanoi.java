package ch02;

/**
 * @author Ren
 *
 * 递归方式的汉诺塔
 */
import java.util.*;
public class R01_Hanoi {

    static int counts = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Hanoi(n,"A","B","C");
        System.out.println("共执行了"+counts+"次");
    }

    /**
     *
     * @param n  起始的汉诺塔圆盘个数
     * @param A  起始位置
     * @param B  过渡位置
     * @param C  目标位置
     */
    public static void Hanoi(int n,String A,String B,String C){
        if(n==1) {
            MoveOne(n, A, C);
        }else {
            // 将A上面的(n-1)个盘 从A移动到B
            Hanoi(n-1,A,C,B);
            // 将A剩余的第n个盘  从A移动到C
            MoveOne(n,A,C);
            // 完成了第n个盘的移动，B变成了A，A变成B  C盘不变
            Hanoi(n-1,B,A,C);
        }
    }

    public static void MoveOne(int n , String from , String target){
        counts++;
        System.out.println("将第"+n+"个圆盘，从"+from+"柱移动到"+target+"柱");
    }

}
