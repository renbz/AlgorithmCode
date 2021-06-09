package ch01;

/**
 * @author Ren
 */

public class Test01_Radical {

    public static void main(String[] args) {

        System.out.println(radical(100));
        System.out.println(radical2(200));
        //radical3(200,1,0);
    }

    /**
     * 方法一： 求根号n
     */
    public static double radical(long n){
        for (int i = 1; i <= n; i++) {
            if(i*i<=n && (i+1)*(i+1)>n){
                return i;
            }
        }
        return -1;
    }



    /**
     * 方法二： 调用java的math函数库中的方法
     */
    public static double radical2(long n){
        return Math.sqrt(n);
    }
}
