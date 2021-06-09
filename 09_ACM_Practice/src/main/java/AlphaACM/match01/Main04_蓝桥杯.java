package AlphaACM.match01;

/**
 * @author Ren
 */

public class Main04_蓝桥杯 {

    public static void main(String[] args) {
        long sum =0;
        for (int i = 1937; i <= 2020; i++) {
            if((i%4==0 && i%100!=0)  || i%400==0){
                sum+=366;
            }else{
                sum+=365;
            }
        }
        sum = sum + 31+28+20;
        long res = sum%7>=4 ? sum/7+1 : sum/7;
        System.out.println(res);
    }

}
