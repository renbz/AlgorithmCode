package java_2018_A;

/**
 * @author Ren
 */
public class Main002_星期一 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1901;i<2000;i++){
            if(isR(i)) sum +=366;
            else sum += 365;
        }
        System.out.println(sum/7+"    "+sum%7);
    }
    //判断闰年
    static boolean isR(int y){
        return y%400==0 || (y%4==0 && y%100 !=0);
    }
}