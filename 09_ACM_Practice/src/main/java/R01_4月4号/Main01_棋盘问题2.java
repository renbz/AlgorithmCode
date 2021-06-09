package R01_4月4号;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main01_棋盘问题2 {

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

    private static void check(int i, int k, int i1) {

    }


}
