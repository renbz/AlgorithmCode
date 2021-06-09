package java_2013_A;

/**
 * @author Ren
 */

public class Main001_世纪末的星期 {
    public static void main(String[] args) {
        long t = 0;
        for (int i = 2000;i<=9999 ; i++) {
            if(is(i)){
                t+=366;
            }else{
                t+=365;
            }
            if(t%7==2 && i%100 == 99){
                System.out.println(i);
                break;
            }
        }
    }
    //判断闰年
    static boolean is (int x ){
        return x%400==0 || (x%4==0 && x%100!=0);
    }
}
