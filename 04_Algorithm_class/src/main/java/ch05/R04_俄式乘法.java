package ch05;

/**
 * @author Ren
 */

public class R04_俄式乘法 {

    public static void main(String[] args) {
        int a = (int) (Math.random()*50);
        int b = (int) (Math.random()*50);

        System.out.println(a+" * "+b+"="+f(a,b));
    }

    public static int f(int a,int b){
        int sum = 0;
        while (b > 1){
            a = a<<1;
            if(b%2!=0){
                sum += a/2;
            }
            b = b>>1;
        }
        return a*b +sum ;
    }

}
