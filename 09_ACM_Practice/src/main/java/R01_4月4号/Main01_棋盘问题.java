package R01_4月4号;

/**
 * @author Ren
 */
import java.util.*;
public class Main01_棋盘问题 {

    static char[][] c;
    static int [] array;
    static int count;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            int n = in.nextInt();
            int k = in.nextInt();
            if(n==-1 && k==-1){
                return;
            }
            c = new char[n][n];
            array = new int[k];
            for (int i = 0; i <n ; i++) {
                c[i]=in.next().toCharArray();
            }
            /**
             * 从第几行开始
             */
            for (int i = 0; i <= n - k; i++) {
                check(0,k,i);
            }
            System.out.println(count);
            count=0;
        }

    }


    /**
     * 编写一个方法，放置第k个棋子
     * 特别注意： check 是每一次递归时，进入到check()中 都有  for (int i = 0; i < max; i++)
     * @param n n表示当前存放第几个棋子
     */
    private static void check(int n,int k,int row){
        if(n == k){ // n=k , 其实k个棋子 就已经放好了;
            count++;
            return;
        }
        // 依次放入棋子，并判断是否冲突
        for (int i = 0; i < k; i++) {
            //先把当前的这个棋子  放到该行的第一列
            array[n]=i;
            // 判断当前位置第n个棋子到第i列时，是否冲突
            if(judge(row,i)){ // 不冲突
                //接着放第n+1个元素，即开始递归
                check(n,k,row+1);   //包含了回溯算法
            }
            //如果冲突，就继续执行 array[n]=i; 即 将第n个棋子，放置在本行的 后一个位置
        }
    }


    /**
     * 查看当我们放置第n个棋子时就去检测该棋子是否和前面已经摆放的棋子冲突
     * @param n  棋子放在了第n行
     * @param t  棋子放在了第t列
     */
    private static boolean judge(int n,int t){
        for (int i = 0; i < n; i++) {
            /**
             * 说明
             * 1. array[i] == array[n]  表示判断 第n个棋子是否和前面的n-1个棋子在同一列
             * 2. 没有必要判断是否在同一行 因为n每次都在递增
             */
            if(n<array.length && array[i] == array[n] ){
                return false;
            }

            /**
             * 当前放棋子的区域为空白 则返回false
             */

            if( c[n][t]=='.'){
                return false;
            }
        }
        return true;
    }

}
